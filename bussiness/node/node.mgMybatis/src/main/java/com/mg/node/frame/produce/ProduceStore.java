package com.mg.node.frame.produce;

import com.itranswarp.compiler.JavaStringCompiler;
import com.mg.common.unit.ClassUnit;
import com.mg.common.unit.MethodUnit;
import com.mg.node.common.generate.db.DBUtils;
import com.mg.node.frame.imp.IGeneralMapper;
import com.mg.node.frame.template.GeneralTemplate;
import com.mg.node.frame.template.TemplateReturn;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.type.classreading.CachingMetadataReaderFactory;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Type;
import java.util.*;


@Slf4j
public class ProduceStore {

    private volatile Map<String, List<ProduceItem>> m_map = new HashMap();

    List<String> m_scan = new ArrayList();

    public static ProduceStore store;


    private Class defTemplate = GeneralTemplate.class;
    private Class defImp = IGeneralMapper.class;


    public static ProduceStore single()
    {
        if(store==null)
        {
            store = new ProduceStore();
        }
        return store;
    }

    private void addDate(ProduceItem item)
    {
        List<ProduceItem> list = m_map.get(item.getPojo().getSimpleName());
        if(list==null){
            list = new ArrayList<>();
        }
        list.add(item);
        m_map.put(item.getPojo().getSimpleName(),list);
    }

    private List<ProduceItem> getData(String key)
    {
        List<ProduceItem> list = m_map.get(key);
        if(list==null){
            list = new ArrayList<>();
        }
        m_map.put(key,list);
        return list;
    }

    /**
     * 添加新的pojo
     * @param pojo
     */
    public void addPojo(Class pojo){
        addPojo(pojo,this.defTemplate,this.defImp);
    }

    /**
     * 添加新的pojo
     * @param pojo
     * @param template
     * @param imp
     */
    public void addPojo(Class pojo,Class template,Class imp){
        if(!checkPojo(pojo,template,imp))return;
        log.debug("{}添加至mapper列表",pojo.getName());
        ProduceItem item = new ProduceItem();
        item.setPojo(pojo);
        item.setTemplate(template);
        item.setImp(imp);
        addParams(item);
        addDate(item);
    }

    /**
     * 检查添加pojo的合法
     * @param pojo
     * @param template
     * @param imp
     * @return
     */
    public boolean checkPojo(Class pojo,Class template,Class imp)
    {
        Method[] methodsTemplate = template.getMethods();

        methd:for(Method mt : methodsTemplate)
        {
            try {
                imp.getMethod(mt.getName(),mt.getParameterTypes());
            } catch (NoSuchMethodException e) {
                log.debug("模板{}函数{}未在接口类{}中找到匹配项，请检查！！",template.getName(),mt.toString(),imp.getName());
                return false;
            }
        }

        List<ProduceItem> items = getData(pojo.getSimpleName());
        for(ProduceItem item:items)
        {
            if(item.getPojo().equals(pojo)&&item.getTemplate().equals(template)&&item.getImp().equals(imp))
            {
                log.debug("已添加过pojo类为{}，模板类为{}，接口类为{}的mapper映射，跳过此次添加！",pojo.getName(),template.getName(),imp.getName());
                return false;
            }
        }
        return true;
    }

    /**
     * 添加参数设置
     * @param item
     */
    public void addParams(ProduceItem item)
    {
        item.addParam("$tableName$",DBUtils.getTableName(item.getPojo().getSimpleName()));
    }

    /**
     * 添加包扫描
     * @param packageName
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void addPackage(String packageName,Class template,Class imp) throws IOException, ClassNotFoundException {
        this.m_scan.add(packageName);
        String path =String.format("classpath*:/%s/*.class",packageName.replace(".","/"));
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        MetadataReaderFactory metaReader = new CachingMetadataReaderFactory();
        Resource[] resources = resolver.getResources(path);
        ClassLoader loader = ClassLoader.getSystemClassLoader();
        for (Resource resource : resources) {
            MetadataReader reader = metaReader.getMetadataReader(resource);
            String className = reader.getClassMetadata().getClassName();
            Class<?> clazz = loader.loadClass(className);
            addPojo(clazz,template,imp);
        }
    }

    /**
     * 添加包扫描
     * @param packageName
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public void addPackage(String packageName) throws IOException, ClassNotFoundException {
        addPackage(packageName,defTemplate,defImp);
    }

    /**
     * 获取所有mapper类
     * @return
     */
    public List<Class> listClass()
    {
        Iterator<List<ProduceItem>> iterator = m_map.values().iterator();

        List<Class> result = new ArrayList<>();

        while(iterator.hasNext())
        {
            List<ProduceItem> list = iterator.next();
            if(list!=null&&list.size()>0)
            {
                for(ProduceItem item :list)
                {
                    try {
                        Class cl = buildClass(item);
                        result.add(cl);
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return result;
    }

    /**
     * 构建mapper类
     * @param item
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private Class buildClass(ProduceItem item) throws IOException, ClassNotFoundException {

        // 声明类名
        String mapperName = item.getPojo().getSimpleName()+"Mapper";
        String packageName =  item.getPojo().getPackage().getName() + ".mapper";

        String impName =item.getImp().getSimpleName();
        String impFullName =item.getImp().getName();
        String impPackage = item.getImp().getPackage().getName();

        String fullName = String.format("%s.%s", packageName, mapperName);

        ClassUnit unit = new ClassUnit();
        unit.setName(mapperName);
        unit.setPackageName(packageName);
        unit.addImplement(String.format("%s<%s>",impName,item.getPojo().getSimpleName()));
        unit.setType(2);

        unit.addImport(impFullName);
        unit.addImport("org.apache.ibatis.annotations.Select");
        unit.addImport(item.getPojo().getName());

        Class template = item.getTemplate();

        String content = template.toGenericString();
        String pStr;
        Method[] methods = template.getMethods();
        for (Method method : methods) {
            MethodUnit methodUnit = new MethodUnit();
            methodUnit.setName(method.getName());
            methodUnit.setType(2);

            Type returnParam = method.getGenericReturnType();
            String returnStr ="";
            if(returnParam instanceof List)
            {
                returnStr =String.format("List<%s>",item.getPojo().getSimpleName());
            }
            else if(returnParam.equals(TemplateReturn.class)){
                returnStr =String.format("%s",item.getPojo().getSimpleName());
            }
            else if(returnParam.equals(Object.class))
            {
                returnStr =method.getReturnType().getSimpleName();
            }

            methodUnit.setReturnValue(returnStr);

            Annotation[] annotations = method.getAnnotations();

            for(Annotation annotation : annotations)
            {
               String annStr = annotation.toString().substring(1).replace("[","\"").replace("]","\"");

               for(Map.Entry<String,String> entry: item.getParams().entrySet())
               {
                   annStr= annStr.replace(entry.getKey(), entry.getValue());
               }

               methodUnit.addAnnotation(annStr);
            }

            Parameter[] ps = method.getParameters();
            for (Parameter p : ps) {
                methodUnit.addParam(p.getType().getSimpleName(),p.getName());
            }
            unit.addMethod(methodUnit);
        }

        JavaStringCompiler compiler = new JavaStringCompiler();
        Map<String, byte[]> results = compiler.compile(mapperName + ".java", unit.finish());
        // 加载内存中byte到Class<?>对象
        Class<?> clazz = compiler.loadClass(fullName, results);

        log.debug("成功构建mapper类{}",clazz.getName());
        return clazz;
    }



}
