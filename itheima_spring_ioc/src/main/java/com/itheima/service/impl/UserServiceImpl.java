package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImpl implements UserService {
    public void save() {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        4、使用Spring的API获得Bean实例
        UserDao userDao = (UserDao) app.getBean("userDao");
        // 此时 可以调用相关实现方法
        userDao.save();
    }
}
