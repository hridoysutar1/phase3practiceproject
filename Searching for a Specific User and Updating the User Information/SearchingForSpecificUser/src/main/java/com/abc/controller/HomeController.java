package com.abc.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abc.dao.UserDao;
import com.abc.entities.User;

@Controller
public class HomeController {
	@Autowired
	UserDao dao;
	
	
	
	@RequestMapping("/editform")
	public String edit() {
		System.out.println();
		
	    return "editform";
	}
	
	@RequestMapping("/edit")
	public String result(@RequestParam("userid") int id,@RequestParam("username") String uname,@RequestParam("usercity") String city, Model model) {
		try {
			User user= new User(id,uname,city);
			dao.updateUser(user);
			
		}catch(Exception e){
			return "fail";
			
		}
		
		return "success";
	}
	@RequestMapping("/userdetails")
	public String userdet() {
		System.out.println();
		
	    return "userdetails";
	}
	
	@RequestMapping("/showuser")
	public String userdetails(@RequestParam("userid") int id,Model model) {
		
		try {
			User user;
			user=dao.getUser(id);
			model.addAttribute("id",user.getUserId());
			model.addAttribute("name",user.getUserName());
			model.addAttribute("city",user.getUserCity());
			
		}catch(Exception e){
			return "fail";
			
		}
		
		
		return "showuser";
	}
	@RequestMapping("/all")
	public String all(Model m) {
		User user;
		
		List<User> userlist=dao.getAllUser();
		m.addAttribute("userlist",userlist);
		System.out.println(userlist);
		return "alluser";
	}
	@RequestMapping("/userinsertion")
	public String userin() {
		System.out.println();
		
	    return "userinsertionform";
	}
	@RequestMapping("/newUser")
	public String newUser(@RequestParam("userid") int id,@RequestParam("username") String uname,@RequestParam("usercity") String city, Model model) {
		try {
			User user= new User(id,uname,city);
			dao.insert(user);
			
		}catch(Exception e){
			return "fail";
			
		}
		
		return "success";
	}
	
	
//	
//	@RequestMapping("/edit")
//	public String result(@RequestParam("userid") int id,@RequestParam("username") String uname,@RequestParam("usercity") String city, Model model) {
//		try {
//			User user= new User(id,uname,city);
//			dao.updateUser(user);
//			
//		}catch(Exception e){
//			return "fail";
//			
//		}
//		
//		return "success";
//	}
	

}
