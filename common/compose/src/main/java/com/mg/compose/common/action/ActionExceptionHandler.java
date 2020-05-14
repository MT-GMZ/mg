package com.mg.compose.common.action;

import com.mg.common.pojo.CommonItem;
import com.mg.compose.common.constant.SysConstant;
import com.mg.compose.common.service.convert.BasicCommonUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
@ControllerAdvice
public class ActionExceptionHandler {

    @Autowired
    BasicCommonUtil utils;

    Logger logger = LoggerFactory.getLogger(SysConstant.getSys());
    @ResponseBody
    @ExceptionHandler
    public CommonItem processEx(Exception ex) throws Exception {

        String errorReason =String.format("[%s]异常：[%s]", SysConstant.getSys(),ex.getMessage());

        logger.info(String.format("[%s]异常：[%s] (%s)", SysConstant.getSys(),ex.getMessage(), ex.getStackTrace()[0]));
        ex.printStackTrace();

        return utils.fail(errorReason);
    }
}
