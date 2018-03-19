package com.niit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.niit.model.UserDetailsDAO;

import com.niit.pojo.UserDetails;

@Controller
public class PageController {
	
	@Autowired
	private UserDetailsDAO userDetailsDAOImpl;
	
	@ModelAttribute("userdetails")

	public UserDetails createUserDetailsModel()
	{
		UserDetails userdetails=new UserDetails();
		return userdetails;
		
	
	}
	
	
	@RequestMapping(value = { "/" })
	public String showHomePage() {
		return "index";
	}

	@RequestMapping(value = { "/Register" })
	public String showRegisterPage() {
		return "Register";
	}

	@RequestMapping(value ="getData",method=RequestMethod.POST)
	
	public String showRegisterPage(@ModelAttribute UserDetails userdetails , Model m) 
	{
		System.out.println("userdetails are created");
		m.addAttribute("userdetails", userdetails);
		userDetailsDAOImpl.addUserDetails(userdetails);
		userDetailsDAOImpl.updateUserDetails(userdetails);
		
		return "Register";
	}

	@RequestMapping(value="/Edit",method = RequestMethod.GET)
	
		public String showEditPage(@ModelAttribute UserDetails userdetails , Model m) 
		{
		
		return "Register";
	}

	
	@RequestMapping(value = { "/AboutUS" })
	public String showAboutUsPage() {
		return "AboutUs";
	}

}
