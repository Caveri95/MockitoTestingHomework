package com.example.mockitotestinghomework.services;

import com.example.mockitotestinghomework.model.User;
import com.example.mockitotestinghomework.repository.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private final UserDaoImpl userDao = new UserDaoImpl();

    @Override
    public boolean checkUserExist(User user) {
        return userDao.checkUserExist(user);
    }
}
