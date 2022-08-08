package com.bjpowernode.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author 临渊
 * @Date 2022-08-08 8:14
 */
public class Student {
    private String name;
    /*@DateTimeFormat(pattern = "yyyy-MM-dd")*/
    private Date birthday;

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public Student(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
