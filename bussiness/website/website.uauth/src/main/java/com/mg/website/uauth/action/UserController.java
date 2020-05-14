package com.mg.website.uauth.action;import com.alibaba.fastjson.JSONObject;import com.mg.website.uauth.common.pojo.ApiResultItem;import com.mg.website.uauth.db.pojo.RmtUserInfo;import com.mg.website.uauth.constant.action.UserControllerConstant;import com.mg.website.uauth.service.dto.UserDTO;import lombok.extern.slf4j.Slf4j;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.web.bind.annotation.RequestBody;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.RestController;@RestController@Slf4jpublic class UserController {		@Autowired    UserDTO dto;		@Autowired    RmtUserInfoCommonUtil commonUtil;		@RequestMapping(UserControllerConstant.ACTION_GET)	public ApiResultItem get(@RequestBody JSONObject params) throws Exception{		RmtUserInfo pojo = new RmtUserInfo();		pojo.setId(params.getString("id"));		return dto.get(commonUtil.toCommon(pojo));	}		@RequestMapping(UserControllerConstant.ACTION_EDIT)	public ApiResultItem edit(@RequestBody JSONObject params) throws Exception{//		ReentrantLock//		HashMap		RmtUserInfo pojo = new RmtUserInfo();		pojo.setId(params.getString("id"));		pojo.setUsercode(params.getString("usercode"));		pojo.setUsername(params.getString("username"));		pojo.setUserpassword(params.getString("userpassword"));		pojo.setDisplayname(params.getString("displayname"));		pojo.setUserthumb(params.getString("userthumb"));		pojo.setWorkcode(params.getString("workcode"));		pojo.setOganizationid(params.getString("oganizationid"));		pojo.setDepartmentid(params.getString("departmentid"));		pojo.setUserextendid(params.getString("userextendid"));		pojo.setCreatedtime(params.getDate("createdtime"));		pojo.setCreateuserid(params.getString("createuserid"));		pojo.setModifytime(params.getDate("modifytime"));		pojo.setModifyuserid(params.getString("modifyuserid"));		pojo.setLimitedtime(params.getDate("limitedtime"));		pojo.setLogincount(params.getByte("logincount"));		pojo.setSelectcondition(params.getByte("selectcondition"));		pojo.setSystemuserflag(params.getByte("systemuserflag"));		return dto.edit(commonUtil.toCommon(pojo));	}		@RequestMapping(UserControllerConstant.ACTION_LIST)	public ApiResultItem list(@RequestBody JSONObject params) throws Exception{		return dto.list(commonUtil.success());	}		@RequestMapping(UserControllerConstant.ACTION_DELETE)	public ApiResultItem delete(@RequestBody JSONObject params) throws Exception{		RmtUserInfo pojo = new RmtUserInfo();		pojo.setId(params.getString("id"));		return dto.delete(commonUtil.toCommon(pojo));	}		@RequestMapping(UserControllerConstant.ACTION_LOGIN)	public ApiResultItem login(@RequestBody JSONObject params) throws Exception{        RmtUserInfo userInfo = new RmtUserInfo();        userInfo.setUsername(params.getString("username"));        userInfo.setUserpassword(params.getString("userpassword"));        ApiResultItem result = dto.login(commonUtil.toCommon(userInfo));        return result;	}}