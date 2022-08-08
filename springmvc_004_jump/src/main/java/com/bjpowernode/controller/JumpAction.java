package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 临渊
 * @Date 2022-08-07 22:24
 */

@Controller
public class JumpAction {
    @RequestMapping("/one")
    public String one() {
        System.out.println("1请求转发");
        return "main";
    }

    @RequestMapping("/two")
    public String two() {
        System.out.println("2请求转发action");
        return "forward:/other.action";
    }

    @RequestMapping("/three")
    public String three() {
        System.out.println("3重定向页面");
        return "redirect:/admin/main.jsp";
    }

    @RequestMapping("/four")
    public String four() {
        System.out.println("3重定向action");
        return "redirect:/other.action";
    }


}
