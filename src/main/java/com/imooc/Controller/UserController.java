package com.imooc.Controller;

import com.imooc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @program: imooc-springboot-starter
 * @description: Test
 * @author: lvyt
 * @create: 2020-06-09 14:04
 */
@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("/getUser")
    @ResponseBody
    public User hello(){
        User u=new User();
        u.setName("张三");
        u.setPassword("123");
        u.setAge(18);
        u.setBirthday(new Date());
        return u;
    }
}
