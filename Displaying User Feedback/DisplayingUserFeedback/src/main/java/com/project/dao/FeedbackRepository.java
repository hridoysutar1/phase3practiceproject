package com.project.dao;

import org.springframework.data.repository.CrudRepository;

import com.project.entities.Feedback;

public interface FeedbackRepository extends CrudRepository<Feedback,Integer> {

}
