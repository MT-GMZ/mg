package com.mg.node.common.action;

import com.mg.common.pojo.ResultItem;
import com.mg.node.common.constant.SysConstant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
@ControllerAdvice
public class ActionExceptionHandler {


    Logger logger = LoggerFactory.getLogger(SysConstant.getSys());
    @ResponseBody
    @ExceptionHandler
    public ResultItem processEx(Exception ex) throws Exception {

        String errorReason =String.format("[%s]异常：[%s]", SysConstant.getSys(),ex.getMessage());

        logger.info(String.format("[%s]异常：[%s] (%s)", SysConstant.getSys(),ex.getMessage(), ex.getStackTrace()[0]));
        ex.printStackTrace();

        return new ResultItem(-1,ex.getMessage());
    }
}
