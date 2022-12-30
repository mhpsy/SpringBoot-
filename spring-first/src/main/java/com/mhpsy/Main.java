package com.mhpsy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //这行代码一执行就获取了Spring容器
        //解析application.xml文件
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("application.xml", "xxx.xml", "date.xml");
        //ClassPathXmlApplicationContext是ApplicationContext的实现类
        //ClassPathXmlApplicationContext可以接受一个或多个xml文件的路径，源码里面是一个可变参数String... str

        Object user = applicationContext.getBean("user");
        System.out.println(user);        //com.mhpsy.bean.User@3ec300f1


        Object xxx = applicationContext.getBean("xxx");
        System.out.println(xxx);        //com.mhpsy.bean.xxx@482cd91f


        Object date = applicationContext.getBean("date");
        System.out.println(date);        //Fri Dec 30 23:13:01 CST 2022

        Date dateObj = (Date) applicationContext.getBean("date");//强转
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(dateObj));        //2022-12-30

        Date dateGetBean = applicationContext.getBean("date", Date.class);//直接传入类型.class
        System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS").format(dateGetBean));        //2022-12-30 23:19:38 095




    }
}