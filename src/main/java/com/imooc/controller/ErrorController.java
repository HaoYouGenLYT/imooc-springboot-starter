package com.imooc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: imooc-springboot-starter
 * @description: 异常
 * @author: lvyt
 * @create: 2020-07-09 10:56
 */
@Controller
@RequestMapping("err")
public class ErrorController {
    public String error(){
        int a=1/0;
        return "thymeleaf/error";
    }
}
