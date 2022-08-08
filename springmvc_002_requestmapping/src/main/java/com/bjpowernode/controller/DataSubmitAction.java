package com.bjpowernode.controller;

import com.bjpowernode.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author 临渊
 * @Date 2022-08-07 8:48
 */

@Controller
public class DataSubmitAction {

    @RequestMapping("/one")
    public String one(String name, Integer age) {
        System.out.println("name = " + name);
        System.out.println("age" + age + "=====" + (age + 100));
        return "main";
    }

    @RequestMapping("/two")
    public String two(Users users) {
        System.out.println("name = " + users.getName());
        System.out.println("age" + users.getAge() + "=====" + (users.getAge() + 100));
        System.out.println(users);
        return "main";
    }

    @RequestMapping("/three/{name}/{age}")
    public String three(
            @PathVariable("name")
            String name,
            @PathVariable("age")
            Integer age) {
        System.out.println("name = " + name);
        System.out.println("age" + age + "=====" + (age + 100));
        return "main";
    }

    @RequestMapping("/four")
    public String four(
            @RequestParam("uname")
            String name,
            @RequestParam("uage")
            Integer age) {
        System.out.println("name = " + name);
        System.out.println("age" + age + "=====" + (age + 100));
        return "main";
    }

    @RequestMapping("/five")
    public String five(HttpServletRequest request) {
        String name = request.getParameter("name");
        Integer age = Integer.valueOf(request.getParameter("age"));
        System.out.println("name = " + name);
        System.out.println("age" + age + "=====" + (age + 100));
        return "main";
    }

}
