package com.example.mockitotestinghomework.services;

import com.example.mockitotestinghomework.model.User;
import com.example.mockitotestinghomework.repository.UserDao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    boolean TRUE = true;
    boolean FALSE = false;
    User Anna = new User("Анна");
    User Victor = new User("Виктор");

    @Mock
    private UserDao userDaoMock;

    @InjectMocks
    private UserServiceImpl out;


    @Test
    public void checkUserExist() {
        when(userDaoMock.checkUserExist(Anna)).thenReturn(TRUE);
        when(userDaoMock.checkUserExist(Victor)).thenReturn(FALSE);

        Assertions.assertTrue(out.checkUserExist(Anna));
        Assertions.assertFalse(out.checkUserExist(Victor));
    }
}