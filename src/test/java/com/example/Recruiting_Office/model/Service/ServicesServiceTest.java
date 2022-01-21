package com.example.Recruiting_Office.model.Service;

import com.example.Recruiting_Office.model.Entities.Contractor;
import com.example.Recruiting_Office.model.Entities.Feedback;
import com.example.Recruiting_Office.model.Entities.Services;
import com.example.Recruiting_Office.model.Entities.User;
import com.example.Recruiting_Office.model.Repository.ServicesRepository;
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

class ServicesServiceTest {
    @Mock
    ServicesRepository servicesRepository;
    @InjectMocks
    ServicesService servicesService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetServices() {
        Optional<Services> result = servicesService.getServices(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testGetServicess() {
        List<Services> result = servicesService.getServicess();
        Assertions.assertEquals(Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(new Feedback("subject", "description", null, null)), Arrays.<Services>asList(null)), new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(new Feedback("subject", "description", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(null)), null)))), result);
    }

    @Test
    void testAddNewServices() {
        servicesService.addNewServices(new Services(0, "category", "description", "img", "link", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(new Feedback("subject", "description", null, null)), Arrays.<Services>asList(null)), new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(new Feedback("subject", "description", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(null)), null))));
    }

    @Test
    void testDeleteServices() {
        servicesService.deleteServices(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme