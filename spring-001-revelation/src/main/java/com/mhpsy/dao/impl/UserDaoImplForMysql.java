package com.mhpsy.dao.impl;

import com.mhpsy.dao.UserDao;

public class UserDaoImplForMysql implements UserDao {

    @Override
    public void deleteById(int id) {
        System.out.println("delete user by id from mysql  " + id);
    }

}
