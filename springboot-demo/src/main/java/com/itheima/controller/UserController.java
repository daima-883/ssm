package com.itheima.controller;

import com.itheima.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class UserController {
    @Autowired
    private Person person;
    @GetMapping(value = "/user")
    public String save(){
        System.out.println(person.getName());
        System.out.println(person);
        return "user having save";
    }
}
