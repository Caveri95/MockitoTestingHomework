package com.example.mockitotestinghomework.repository;

import com.example.mockitotestinghomework.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoImplTest {
    private UserDaoImpl userDaoImpl;

    @Test
    void getUserByName() {
        Assertions.assertEquals(new User("Анна"), userDaoImpl.getUserByName("Анна"));
    }

}