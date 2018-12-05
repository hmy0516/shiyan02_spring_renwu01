package com.hanlu.ioc;

/**
 * @author HMY
 * @date 2018/11/27-23:14
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void say() {
        System.out.println("userDao say hello Word!");
    }
}
