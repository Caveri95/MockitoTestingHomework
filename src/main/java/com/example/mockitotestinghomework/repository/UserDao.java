package com.example.mockitotestinghomework.repository;

import com.example.mockitotestinghomework.model.User;
import java.util.List;

public interface UserDao {
   User getUserByName(String name);

    List<User> findAllUsers();

    boolean checkUserExist(User user);
}
