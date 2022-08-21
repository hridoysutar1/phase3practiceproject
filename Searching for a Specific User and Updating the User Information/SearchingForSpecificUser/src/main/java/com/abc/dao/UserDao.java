package com.abc.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.abc.entities.User;



public class UserDao {
	
	private HibernateTemplate hibernateTemplate;
	@Transactional
	public int insert(User user) {
		  
		int res=(int) this.hibernateTemplate.save(user);
		return res;
	}
	public User getUser(int userId) {
		User user1=this.hibernateTemplate.get(User.class, userId);
		return user1;
	}
	
	public List<User> getAllUser(){
		List<User> us= this.hibernateTemplate.loadAll(User.class);
		return us;
	}
	@Transactional
	public void delete(int userId) {
		User us=this.hibernateTemplate.get(User.class,userId);
		this.hibernateTemplate.delete(us);
	}
	@Transactional
	public void updateUser(User user) {
		this.hibernateTemplate.update(user);
	}
	
	
	
	
	
	
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	

}
