package com.project.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.project.dao.FeedbackRepository;
import com.project.entities.Feedback;
import com.project.service.FeedbackService;

@RestController
public class Controller {
	
	@Autowired
	private FeedbackRepository repo;
	
	@PostMapping("/feedback")
	public ResponseEntity<Feedback> newUser(@RequestParam("userName") String uname,@RequestParam("feedbackMsg") String msg, Model model) {
		try {
			Feedback fee= new Feedback ();
			fee.setUserName(uname);
			fee.setFeedbackMsg(msg);
			repo.save(fee);
			return new ResponseEntity<Feedback>(fee, HttpStatus.OK);
		}catch(Exception e){
			
			return new ResponseEntity<Feedback>( HttpStatus.NOT_FOUND);
			
		}
	}
	
private ResponseEntity<Feedback> ResponseEntity(Optional<Feedback> of) {
	// TODO Auto-generated method stub
	return null;
}

}
