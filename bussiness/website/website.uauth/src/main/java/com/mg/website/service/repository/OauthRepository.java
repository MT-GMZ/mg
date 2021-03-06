package com.mg.website.service.repository; 

import org.springframework.stereotype.Service;
import com.mg.website.pojo.dto.in.InOauthDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import com.mg.common.pojo.ResultItem;
import com.mg.website.service.feign.OauthFeign;

@Service
@Slf4j
public class OauthRepository {
   @Autowired
   OauthFeign feign;

   
   public ResultItem login(InOauthDto item) throws Exception{
      item.setClient_id("website");
      item.setClient_secret("123456");
      item.setGrant_type("password");

      ResultItem result = feign.token(item.getClient_id(),item.getClient_secret(),item.getGrant_type(),
              item.getUsername(),item.getPassword());
      return result;
   }

}
