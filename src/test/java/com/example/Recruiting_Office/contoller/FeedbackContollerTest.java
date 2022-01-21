package com.example.Recruiting_Office.contoller;

import com.example.Recruiting_Office.model.Entities.Contractor;
import com.example.Recruiting_Office.model.Entities.Feedback;
import com.example.Recruiting_Office.model.Entities.Services;
import com.example.Recruiting_Office.model.Entities.User;
import com.example.Recruiting_Office.model.Service.FeedbackService;
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

class FeedbackContollerTest {
    @Mock
    FeedbackService feedbackService;
    @InjectMocks
    FeedbackContoller feedbackContoller;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testGetFeedbacks() {
        when(feedbackService.getFeedbacks()).thenReturn(Arrays.<Feedback>asList(new Feedback("subject", "description", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))), new Services(0, "category", "description", "img", "link", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(null)), new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))));

        List<Feedback> result = feedbackContoller.getFeedbacks();
        Assertions.assertEquals(Arrays.<Feedback>asList(new Feedback("subject", "description", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))), new Services(0, "category", "description", "img", "link", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(null)), new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))), result);
    }

    @Test
    void testGetFeedbacks2() {
        when(feedbackService.getFeedback(anyInt())).thenReturn(null);

        Optional<Feedback> result = feedbackContoller.getFeedbacks(Integer.valueOf(0));
        Assertions.assertEquals(null, result);
    }

    @Test
    void testRegisterNewFeedback() {
        feedbackContoller.registerNewFeedback(new Feedback("subject", "description", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(new Services(0, "category", "description", "img", "link", null, new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null)))), new Services(0, "category", "description", "img", "link", new User("name", "password", "email", "city", 0, Arrays.<Feedback>asList(null), Arrays.<Services>asList(null)), new Contractor(0, "name", 0, "address", "nationality", "category", Arrays.<Services>asList(null)), Arrays.<Feedback>asList(null))));
    }

    @Test
    void testDeleteFeedback() {
        feedbackContoller.deleteFeedback(Integer.valueOf(0));
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme