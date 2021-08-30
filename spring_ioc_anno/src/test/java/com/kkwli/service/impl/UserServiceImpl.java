package com.kkwli.service.impl;

import com.kkwli.dao.UserDao;
import com.kkwli.service.UserService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;


//@Component("userService")
@Service("userService")
//@Scope("prototype")
//@Scope("singleton")
public class UserServiceImpl implements UserService {

    @Value("${jdbc.driver}")
    private String driver;

    /*@Autowired
    @Qualifier("userDao")*/
    @Resource(name = "userDao")
    private UserDao userDao;

    @Override
    public void save() {
        System.out.println(driver);
        userDao.save();
    }

    @PostConstruct
    public void init() {
        System.out.println("Service对象的初始化方法");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Service对象的销毁方法");
    }
}
