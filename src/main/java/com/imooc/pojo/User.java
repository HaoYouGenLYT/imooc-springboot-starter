package com.imooc.pojo;

import java.util.Date;

/**
 * @program: imooc-springboot-starter
 * @description: user
 * @author: lvyt
 * @create: 2020-06-09 15:22
 */
public class User {
    private String name;
    private String password;
    private Integer age;
    private Date birthday;
    private String desc;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
