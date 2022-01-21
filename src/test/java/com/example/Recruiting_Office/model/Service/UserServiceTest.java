package com.example.Recruiting_Office.model.Service;

import com.example.Recruiting_Office.model.Entities.Contractor;
import com.example.Recruiting_Office.model.Entities.Feedback;
import com.example.Recruiting_Office.model.Entities.Services;
import com.example.Recruiting_Office.model.Entities.User;
import com.example.Recruiting_Office.model.Repository.UserRepository;
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

class UserServiceTest {
    @Mock
    UserRepository userRepository;
    @InjectMocks
    UserService userService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetUser() {
        Optional<User> result = userService.getUser(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testGetCheck() {
        when(userRepository.findPasswordByname(anyString())).thenReturn("findPasswordBynameResponse");
        when(userRepository.existsByname(anyString())).thenReturn(Boolean.TRUE);

        String result = userService.getCheck("name", "password");
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }

    @Test
    void testGetUsers() {
        List<User> result = userService.getUsers();
        Assertions.assertEquals(Arrays.<User>asList(new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(new Feedback("subject", "description", null, new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))), Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(new Feedback("subject", "description", null, null)))))), result);
    }

    @Test
    void testAddNewUser() {
        userService.addNewUser(new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(new Feedback("subject", "description", null, new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))), Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(new Feedback("subject", "description", null, null))))));
    }

    @Test
    void testDeleteUser() {
        userService.deleteUser(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme