package com.imooc.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: imooc-springboot-starter
 * @description: Test
 * @author: lvyt
 * @create: 2020-06-09 14:04
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public Object hello(){
        return ("Hello springboot...");
    }
}
