package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//<bean id="userService" class="com.itheima.service.impl.UserServiceImpl"></bean>
@Service("userSerivce")
//@Component("userSerivce")
//@Scope("singleton") // 单例
//@Scope("prototype") // 多例
public class UserServiceImpl implements UserService {
    //<property name="userDao" ref="userDao"></property>
//    @Autowired
//    @Qualifier("userDao")
    @Resource(name = "userDao")
    private UserDao userDao;
    @Value("${jdbc.driver}")
    private String driver;

    // 这里注意如果使用xml配置的这里一定要写上
    //如果使用spring注解则这里可以不写

//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }
    public void save() {
        System.out.println(driver);
        userDao.save();
    }
    @PostConstruct
    public void init(){
        System.out.println("Service对象初始化方法");
    }
    @PreDestroy
    public void destory(){
        System.out.println("Service对象销毁方法");
    }
}
