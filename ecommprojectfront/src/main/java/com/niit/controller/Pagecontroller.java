package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class Pagecontroller 
{
	
	
	@RequestMapping("/")
	
	public String showIndex()
	{
		return "index";
	}
	
	
	@RequestMapping("/login")
	public String showLoginPage()
	{
		return "login";
	}
	@RequestMapping("/register")
	public String showRegister()
	{
		return "register";
	}

	@RequestMapping("/AboutUs")
	public String showAboutUs()
	{
		return "AboutUs";
	}
	
	@RequestMapping("/ContactUs")
	public String showContactUs()
	{
		return "ContactUs";
	}
	
}