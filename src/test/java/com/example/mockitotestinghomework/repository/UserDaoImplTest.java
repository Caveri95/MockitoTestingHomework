package com.example.mockitotestinghomework.repository;

import com.example.mockitotestinghomework.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UserDaoTest {
    private final UserDaoImpl userDaoImpl = new UserDaoImpl();


    @Test
    public void shouldReturnUserByName() {
        Assertions.assertEquals(new User("Анна"), userDaoImpl.getUserByName("Анна"));
    }

    @Test
    public void shouldReturnNullWhenInvalidNamePassed() {
        Assertions.assertNull(userDaoImpl.getUserByName("Имя"));
    }
}