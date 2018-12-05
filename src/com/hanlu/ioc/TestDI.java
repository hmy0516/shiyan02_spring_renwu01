package com.hanlu.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author HMY
 * @date 2018/11/27-23:29
 */
public class TestDI {
    public static void main(String[] args) {
        ApplicationContext applicationContxt = new ClassPathXmlApplicationContext("application.xml");
        UserService userService= (UserService) applicationContxt.getBean("userService");
        userService.say();
    }
}
