package com.junit.testing;

import com.junit.entities.User;

public class Authentication {
	//Setting User Authentication properties
	 static User user1=new User(1,"John","johney123@mail.com", "Password123");
	
	public static int chekId() {
		
		return user1.getId();
		
	}
	public static String checkName() {
		return user1.getName();
	}
	public static String checkEmail() {
		return user1.getEmail();
	}
	public static String checkPassword() {
		return user1.getPassword();
	}
	

}
