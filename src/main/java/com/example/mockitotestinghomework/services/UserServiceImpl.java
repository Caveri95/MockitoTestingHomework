package com.example.mockitotestinghomework.services;

import com.example.mockitotestinghomework.model.User;
import com.example.mockitotestinghomework.repository.UserDao;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public boolean checkUserExist(User user) {
        return userDao.checkUserExist(user);
    }
}
