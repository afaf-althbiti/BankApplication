package com.bank.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bank.application.service.LoginService;

@Controller
public class Login {

	@RequestMapping("/login")
	public ModelAndView  handleLoginRequest(@RequestParam("userId") String userId, @RequestParam("password") String password)
	{
		ModelAndView mv = new ModelAndView();
		LoginService ls = new LoginService();
		//
		if(ls.validateLogin(userId, password))
		{
			mv.setViewName("./jsp's/home.jsp");
		}
		else
		{
			mv.setViewName("./jsp's/login.jsp");
		}
		
		return mv;
	}
	
}
