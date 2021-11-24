package com.king.java_interview.java.a;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Queue;
import java.util.Stack;


@SpringBootTest
public class UserTest {
    @Test
    public void test1() {


        User user = new User();

    }


    @Test
    @DisplayName("java反射")
    public void test2() {
        try {
            //  1.使用Class类的newInstance方法来创建对象
            Class class1 = Class.forName("com.king.java_interview.java.a.User");
            User user1 = (User) class1.newInstance();
            user1.init("test1", "男", 12);
            System.out.println(user1);

            //   2.使用Constructor类的newInstance方法来创建兑现
            Class class2 = Class.forName("com.king.java_interview.java.a.User");
            Constructor constructor = class2.getConstructor();
            User user2 = (User) constructor.newInstance();
            user2.init("test2", "男", 12);
            System.out.println(user2);

        } catch (ClassNotFoundException | InvocationTargetException | IllegalAccessException | InstantiationException | NoSuchMethodException e) {
            e.printStackTrace();
        }

    }


    @Test
    @DisplayName("通过clone的方式")
    public void test3() {
        User user1 = new User();
        user1.init("test1", "男", 12);

        User user2 = user1.clone();
        System.out.println(user2);

        //这两个对象不是同一个对象
        System.out.println(user1 == user2);

    }

    @Test
    @DisplayName("反序列化")
    public void test4() {

        User user = new User();
        user.init("king", "男", 12);
        //准备一个文件用于存储该对象的信息
        File f = new File("hello.obj");
        if (!f.exists()) {
            f.mkdirs();
        }
        try (FileOutputStream fos = new FileOutputStream(f);
             ObjectOutputStream oos = new ObjectOutputStream(fos);
             FileInputStream fis = new FileInputStream(f);
             ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            //序列化对象，写入到磁盘中
            oos.writeObject(user);
            //反序列化对象
            User newUser = (User) ois.readObject();

            //测试方法
            newUser.println();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        }

    }
}

