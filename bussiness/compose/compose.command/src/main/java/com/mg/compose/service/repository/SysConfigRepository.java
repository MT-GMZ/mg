package com.mg.compose.service.repository; 

import org.springframework.stereotype.Service;
import com.mg.compose.pojo.dto.InSysConfigDto;
import lombok.extern.slf4j.Slf4j;
import com.mg.compose.pojo.dto.OutSysConfigDto;
import org.springframework.beans.factory.annotation.Autowired;
import com.mg.common.pojo.ResultItem;
import com.mg.compose.service.feign.SysConfigFeign;
import java.util.List;

@Service
@Slf4j
public class SysConfigRepository {
   @Autowired
   SysConfigFeign feign;

   
   public ResultItem get(InSysConfigDto item) throws Exception{
      ResultItem result =  feign.get(item);
      return result;
   }
   
   public ResultItem edit(InSysConfigDto item) throws Exception{
      ResultItem result =  feign.edit(item);
      return result;
   }
   
   public ResultItem list(InSysConfigDto item) throws Exception{
      ResultItem result =  feign.list(item);
      return result;
   }
   
   public ResultItem delete(InSysConfigDto item) throws Exception{
      ResultItem result =  feign.delete(item);
      return result;
   }

}
