package com.example.mockitotestinghomework.services;

import com.example.mockitotestinghomework.model.User;
import com.example.mockitotestinghomework.repository.UserDao;


public class UserService {
    private UserDao userDao;

    public boolean checkUserExist(User user) {
        return userDao.findAllUsers().contains(user);
    }
}
