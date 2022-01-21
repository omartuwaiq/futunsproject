package com.example.Recruiting_Office.contoller;

import com.example.Recruiting_Office.model.Entities.Contractor;
import com.example.Recruiting_Office.model.Entities.Feedback;
import com.example.Recruiting_Office.model.Entities.Services;
import com.example.Recruiting_Office.model.Entities.User;
import com.example.Recruiting_Office.model.Service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;

class UserContollerTest {
    @Mock
    UserService userService;
    @InjectMocks
    UserContoller userContoller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetUsers() {
        when(userService.getUsers()).thenReturn(Arrays.<User>asList(new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(new Feedback("subject", "description", null, new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))), Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(new Feedback("subject", "description", null, null)))))));

        List<User> result = userContoller.getUsers();
        Assertions.assertEquals(Arrays.<User>asList(new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(new Feedback("subject", "description", null, new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))), Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(new Feedback("subject", "description", null, null)))))), result);
    }

    @Test
    void testGetUsers2() {
        when(userService.getUser(anyInt())).thenReturn(null);

        Optional<User> result = userContoller.getUsers(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testRegisterNewUser() {
        userContoller.registerNewUser(new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(new Feedback("subject", "description", null, new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))), Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(new Feedback("subject", "description", null, null))))));
    }

    @Test
    void testCheckLogin() {
        when(userService.getCheck(anyString(), anyString())).thenReturn("getCheckResponse");

        String result = userContoller.checkLogin("name", "password");
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testDeleteUser() {
        userContoller.deleteUser(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme