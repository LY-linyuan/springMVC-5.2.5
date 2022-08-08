package com.bjpowernode.controller;

import com.bjpowernode.pojo.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author 临渊
 * @Date 2022-08-08 7:50
 */
@Controller
public class MyDateAction {

    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

    /*@RequestMapping("/mydate.action")
    public String mydate(
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            Date mydate) {
        System.out.println(mydate);
        System.out.println(sf.format(mydate));
        return "show";
    }*/

    @InitBinder
    public void initBinder(WebDataBinder dataBinder) {
        dataBinder.registerCustomEditor(Date.class, new CustomDateEditor(sf, true));
    }

    @RequestMapping("/mydate.action")
    public String mydate(
            @DateTimeFormat(pattern = "yyyy-MM-dd")
            Date mydate, HttpServletRequest request) {
        System.out.println(mydate);
        System.out.println(sf.format(mydate));
        request.setAttribute("mydate", sf.format(mydate));
        return "show";
    }

    @RequestMapping("list.action")
    public String list(HttpServletRequest request) throws ParseException {
        Student student = new Student("张三", sf.parse("2025-01-01"));
        Student student2 = new Student("李四", sf.parse("2024-01-01"));
        Student student3 = new Student("王五", sf.parse("2023-01-01"));
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student2);
        list.add(student3);
        request.setAttribute("list", list);
        return "show";
    }
}
