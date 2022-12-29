package com.mhpsy.service.impl;

import com.mhpsy.dao.impl.UserDaoImplForMysql;
import com.mhpsy.service.UserService;

public class UserServiceImpl implements UserService {

    UserDaoImplForMysql userDao = new UserDaoImplForMysql();

    @Override
    public void deleteUsersById(int id) {
        userDao.deleteById(id); 
    }


}
