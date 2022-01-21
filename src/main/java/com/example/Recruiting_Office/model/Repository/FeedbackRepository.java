package com.example.Recruiting_Office.model.Repository;

import com.example.Recruiting_Office.model.Entities.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository  extends JpaRepository<Feedback,Integer> {
}
