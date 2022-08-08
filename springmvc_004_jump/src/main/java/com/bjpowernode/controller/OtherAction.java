package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 临渊
 * @Date 2022-08-07 22:27
 */

@Controller
public class OtherAction {

    @RequestMapping("/other.action")
    public String other() {
        System.out.println("other的action");
        return "main";
    }
}
