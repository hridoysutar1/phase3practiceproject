package com.project.service;

import com.project.dao.FeedbackRepository;
import com.project.entities.Feedback;

public class FeedbackService {
	
	FeedbackRepository  repo;
	
	public Feedback createNewFeedback(Feedback f) {
		repo.save(f);
		
		return f;
	}

}
