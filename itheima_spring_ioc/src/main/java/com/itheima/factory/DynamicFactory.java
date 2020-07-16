package com.itheima.factory;

import com.itheima.dao.UserDao;
import com.itheima.dao.impl.UserDaoImpl;

public class DynamicFactory {
//    此时就不能在 是静态的了
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
