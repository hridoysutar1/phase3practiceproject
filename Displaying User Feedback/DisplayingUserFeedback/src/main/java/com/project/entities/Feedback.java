package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Feedback {
   
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String userName;
	private String feedbackMsg;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFeedbackMsg() {
		return feedbackMsg;
	}
	public void setFeedbackMsg(String feedbackMsg) {
		this.feedbackMsg = feedbackMsg;
	}
	public Feedback(int id, String userName, String feedbackMsg) {
		super();
		this.id = id;
		this.userName = userName;
		this.feedbackMsg = feedbackMsg;
	}
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Feedback [id=" + id + ", userName=" + userName + ", feedbackMsg=" + feedbackMsg + "]";
	}
	
	
	
}
