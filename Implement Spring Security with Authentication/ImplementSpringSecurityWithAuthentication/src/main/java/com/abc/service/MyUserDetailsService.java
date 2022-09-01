package com.abc.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.abc.entities.User;
import com.abc.entities.UserPrinciple;
import com.abc.repository.UserRepository;


@Service
public class MyUserDetailsService implements UserDetailsService {
    
	@Autowired
	private UserRepository repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method st
		
		User user=repo.findByUsername(username);
		
		if(user==null) {
			throw new  UsernameNotFoundException("not found");
		}
		return new UserPrinciple(user);
	}

}
