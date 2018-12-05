package com.hanlu.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HMY
 * @date 2018/11/27-23:18
 */
public class TestIoC {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        UserDao userDao = applicationContext.getBean("userDao",UserDao.class);
        userDao.say();
    }
}
