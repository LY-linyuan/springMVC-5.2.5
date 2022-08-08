package com.bjpowernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author 临渊
 * @Date 2022-08-07 8:25
 */

@Controller
public class ReqAction {

    @RequestMapping(value = "/req.action", method = RequestMethod.GET)
    public String req() {
        return "main";
    }

    @RequestMapping(value = "/req.action", method = RequestMethod.POST)
    public String reql() {
        return "main";
    }

}
