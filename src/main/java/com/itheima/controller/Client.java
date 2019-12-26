package com.itheima.controller;

import com.itheima.dao.AccountDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        //1.获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        AccountDao as  = (AccountDao)ac.getBean("accountDao");
        as.findAll();

        //手动关闭容器
        ac.close();
    }
}
