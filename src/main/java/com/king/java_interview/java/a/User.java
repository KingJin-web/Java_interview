package com.king.java_interview.java.a;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: java_interview
 * @description:
 * @author: King
 * @create: 2021-11-23 20:36
 */
@Data
public class User implements Serializable, Cloneable {
    private String name;
    private String sex;
    private Integer age;

    public User() {
        System.out.println("User构造方法");
    }

    public void init(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void println() {
        System.out.println(this);
    }

    @Override
    protected User clone() {
        try {
            return (User) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
