package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 临渊
 * @Date 2022-08-07 7:33
 */

@Controller
public class DemoAction {

    @RequestMapping("/demo.action")
    public String demo() {
        return "main";
    }
}
