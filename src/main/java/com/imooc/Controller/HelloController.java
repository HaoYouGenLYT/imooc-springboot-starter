package com.imooc.Controller;

import com.imooc.pojo.JsonResult;
import com.imooc.pojo.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private Resource resource;

    @RequestMapping("/hello")
    public Object hello(){
        return ("Hello springboot...");
    }

    @RequestMapping("/getResource")
    public JsonResult getResource(){
        Resource bean=new Resource();
        BeanUtils.copyProperties(resource,bean);
        return JsonResult.ok(bean);
    }
}
