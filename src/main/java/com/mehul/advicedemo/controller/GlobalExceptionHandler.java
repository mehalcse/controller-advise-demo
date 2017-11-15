package com.mehul.advicedemo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@Controller
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = Logger.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(Exception.class)
    public String doGlobalExceptionHandling(Exception e) {
        logger.error("Exception " + new Date().getTime(), e);
        System.out.println("In Controller Advice");
        return "/error2";
    }
}
