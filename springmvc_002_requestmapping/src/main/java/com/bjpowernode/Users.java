package com.bjpowernode;

/**
 * @Author 临渊
 * @Date 2022-08-07 9:48
 */
public class Users {
    private String name;
    private int age;

    public Users() {
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
