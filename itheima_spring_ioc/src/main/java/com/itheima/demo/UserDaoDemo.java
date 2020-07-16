package com.itheima.demo;

import com.itheima.dao.UserDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoDemo {
    public static void main(String[] args) {
//        spring 客户端代码
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
//        4、使用Spring的API获得Bean实例
        UserDao userDao = (UserDao) app.getBean("userDao");
        // 此时 可以调用相关实现方法
        userDao.save();
    }
}
