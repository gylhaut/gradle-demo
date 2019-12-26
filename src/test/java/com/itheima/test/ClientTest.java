package com.itheima.test;

import com.itheima.dao.AccountDao;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientTest {

    @Test
    public void testFindAll(){
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
