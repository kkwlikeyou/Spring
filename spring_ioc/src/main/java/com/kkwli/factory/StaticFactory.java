package com.kkwli.factory;

import com.kkwli.dao.UserDao;
import com.kkwli.dao.impl.UserDaoImpl;

public class StaticFactory {
    public static UserDao getUserDao() {
        return new UserDaoImpl();
    }

}
