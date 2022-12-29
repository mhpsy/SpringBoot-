package com.mhpsy.web;

import com.mhpsy.service.UserService;
import com.mhpsy.service.impl.UserServiceImpl;

public class UserAction {

    private UserService userService = new UserServiceImpl();

    public void deleteRequest(int id) {
        userService.deleteUsersById(id);
    }

}
