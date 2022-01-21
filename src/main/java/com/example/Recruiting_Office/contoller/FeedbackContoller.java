package com.example.Recruiting_Office.contoller;

import com.example.Recruiting_Office.model.Entities.Feedback;
import com.example.Recruiting_Office.model.Service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "Feedback")
public class FeedbackContoller {
    private FeedbackService feedbackService;


    @Autowired
    public FeedbackContoller(FeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping
    public List<Feedback> getFeedbacks() {
        System.out.println("in feedback get");
        return feedbackService.getFeedbacks();
    }
    @GetMapping(path = "{feedbackId}")
    public Optional<Feedback> getFeedbacks(@PathVariable(name = "feedbackId") Integer feedbackId) {
        return feedbackService.getFeedback(feedbackId);
    }
    @PostMapping(path = "add")
    public void registerNewFeedback(@RequestBody Feedback feedback){
        feedbackService.addNewFeedback(feedback);
    }

    @DeleteMapping(path = "delete/{feedbackId}")
    public void deleteFeedback(@PathVariable ("feedbackId") Integer feedbackId){

        feedbackService.deleteFeedback(feedbackId);
    }
}
