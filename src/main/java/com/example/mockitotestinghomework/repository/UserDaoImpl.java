package com.example.mockitotestinghomework.repository;

import com.example.mockitotestinghomework.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDaoImpl implements UserDao {

    private final List<User> users;

    public UserDaoImpl() {
        this.users = List.of(new User("Михаил"), new User("Анна"), new User("Виктор"));
    }

    @Override
    public User getUserByName(String name) {
        for (User user : users) {
            if (user.getName().contains(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAllUsers() {
        return users;
    }
}
