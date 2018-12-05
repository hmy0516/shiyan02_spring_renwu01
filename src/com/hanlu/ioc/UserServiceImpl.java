package com.hanlu.ioc;

/**
 * @author HMY
 * @date 2018/11/27-23:25
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao1() {
        return userDao;
    }

    public void setUserDao1(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void say() {
        this.userDao.say();
        System.out.println("userService say hello Word!");
    }
}
