package com.bjpowernode.controller;

import com.bjpowernode.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @Author 临渊
 * @Date 2022-08-07 22:51
 */

@Controller
public class DataAction {
    @RequestMapping("/data")
    public String data(HttpServletRequest request,
                       HttpServletResponse response,
                       HttpSession session,
                       Model model,
                       Map map,
                       ModelMap modelMap) {
        User user = new User("张三三", 203);

        request.setAttribute("requestUsers", user);
        session.setAttribute("sessionUsers", user);
        model.addAttribute("modelUser", user);
        map.put("mapUser", user);
        modelMap.addAttribute("modelMapUser", user);


        return "main";  // 请求转发数据跳转
    }

}
