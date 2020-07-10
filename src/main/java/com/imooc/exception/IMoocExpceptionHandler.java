package com.imooc.exception;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: imooc-springboot-starter
 * @description: 处理全局异常
 * @author: lvyt
 * @create: 2020-07-09 11:14
 */
@ControllerAdvice
public class IMoocExpceptionHandler {
    public static final String IMOOC_ERROR_VIEW="error";
    @ExceptionHandler(value = Exception.class)
    public Object errorHandler(HttpServletRequest request,
                               HttpServletResponse response,Exception e) throws Exception{
        e.printStackTrace();
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("exception",e);
        modelAndView.addObject("url",request.getRequestURL());
        return modelAndView;
    }
}
