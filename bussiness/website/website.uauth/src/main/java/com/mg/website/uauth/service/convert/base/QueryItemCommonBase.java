package com.mg.website.uauth.service.convert.base;import com.mg.common.pojo.CommonData;import com.mg.common.pojo.CommonItem;import com.mg.common.pojo.QueryItem;import com.mg.website.common.service.convert.CommonItemUtils;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import java.util.ArrayList;import java.util.List;public class QueryItemCommonBase implements CommonItemUtils<QueryItem> {	Logger logger = LoggerFactory.getLogger(getClass());		private CommonData toCommonData(QueryItem pojo) {		CommonData data = new CommonData();		return data;	}		private QueryItem toPojoData(CommonData data) {		QueryItem pojo = new QueryItem();		return pojo;	}		public CommonItem toCommon(QueryItem pojo) {		return success(toCommonData(pojo));	}		public  CommonItem toCommon( List<QueryItem> pojos) {		List<CommonData> result = new ArrayList();		for(QueryItem item : pojos){			result.add(toCommonData(item));		}		return success(result);	}		public QueryItem toPojo(CommonItem item) throws Exception{		checkCommonItem(item);		List<CommonData> datas = item.getDatas();		if(datas ==null||datas.size()==0){logger.debug("CommonItem 中data数据为空!!"); return null;}		if(datas.size()>1){logger.debug("CommonItem 中data数据不止一条数据!!"); }		return toPojoData(datas.get(0));	}		public List<QueryItem> toPojoList(CommonItem item) throws Exception{		checkCommonItem(item);		List<QueryItem> result = new ArrayList();			List<CommonData> datas = item.getDatas();			for(CommonData data : datas){				result.add(toPojoData(data));			}			return result;		}				}