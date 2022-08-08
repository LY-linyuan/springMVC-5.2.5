package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @Author 临渊
 * @Date 2022-08-08 8:56
 */

@Controller
public class WebInfAction {

    @RequestMapping("/showIndex")
    public String showIndex() {
        System.out.println("访问index.jsp");
        return "index";
    }

    @RequestMapping("/showMain")
    public String showMain() {
        System.out.println("访问main.jsp");
        return "main";
    }

    @RequestMapping("/showlogin")
    public String showLogin() {
        System.out.println("访问login.jsp");
        return "login";
    }

    @RequestMapping("/login")
    public String login(String name, String password, HttpServletRequest request) {
        if ("zhangs".equals(name) && "123".equals(password)) {
            request.getSession().setAttribute("users", name);
            return "main";
        } else {
            request.setAttribute("msg", "用户名或密码不正确");
            return "login";
        }


    }
}
