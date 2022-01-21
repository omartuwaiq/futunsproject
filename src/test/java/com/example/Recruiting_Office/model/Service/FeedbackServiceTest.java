package com.example.Recruiting_Office.model.Service;

import com.example.Recruiting_Office.model.Entities.Contractor;
import com.example.Recruiting_Office.model.Entities.Feedback;
import com.example.Recruiting_Office.model.Entities.Services;
import com.example.Recruiting_Office.model.Entities.User;
import com.example.Recruiting_Office.model.Repository.FeedbackRepository;
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

class FeedbackServiceTest {
    @Mock
    FeedbackRepository feedbackRepository;
    @InjectMocks
    FeedbackService feedbackService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetFeedback() {
        Optional<Feedback> result = feedbackService.getFeedback(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testGetFeedbacks() {
        List<Feedback> result = feedbackService.getFeedbacks();
        Assertions.assertEquals(Arrays.<Feedback>asList(new Feedback("subject", "description", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))), new Services(0, "category", "description", "img", "link", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(null)), new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))), result);
    }

    @Test
    void testAddNewFeedback() {
        feedbackService.addNewFeedback(new Feedback("subject", "description", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))), new Services(0, "category", "description", "img", "link", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(null)), new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null))));
    }

    @Test
    void testDeleteFeedback() {
        feedbackService.deleteFeedback(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme