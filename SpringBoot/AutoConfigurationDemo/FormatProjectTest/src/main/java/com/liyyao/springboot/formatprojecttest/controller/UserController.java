package com.liyyao.springboot.formatprojecttest.controller;

import com.liyyao.springboot.formatprojecttest.entity.User;
import com.liyyao.springboot.util.HelloFormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private HelloFormatTemplate helloFormatTemplate;

    @GetMapping("/format")
    public String format() {
        User user = new User();
        user.setName("liyyao");
        user.setAge(18);
        return helloFormatTemplate.doFormat(user);
    }
}
