package com.example.Recruiting_Office.model.Service;

import com.example.Recruiting_Office.model.Entities.Feedback;
import com.example.Recruiting_Office.model.Repository.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FeedbackService {

    private FeedbackRepository feedbackRepository;
    @Autowired
    public FeedbackService(FeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public Optional<Feedback> getFeedback(Integer feedbackId) { return feedbackRepository.findById(feedbackId);

    }

    public List<Feedback> getFeedbacks() {
        return feedbackRepository.findAll();
    }
    public void addNewFeedback(Feedback feedback) {
        feedbackRepository.save(feedback);
    }

    public void deleteFeedback(Integer feedbackId) { feedbackRepository.deleteById(feedbackId);

    }
}
