package com.kkwli.service.impl;

import com.kkwli.dao.UserDao;
import com.kkwli.service.UserService;


public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
