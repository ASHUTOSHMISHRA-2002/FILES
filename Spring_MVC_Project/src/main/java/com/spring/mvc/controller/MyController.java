package com.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping("welcome")
	public ModelAndView sayWelcome() {
		ModelAndView mv = new ModelAndView();
//		mv.setViewName("/WEB-INF/views/Welcome.jsp");
		mv.setViewName("Welcome");
		int a = 10/0;
		return mv;
	}
	
	@RequestMapping("hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
//		mv.setViewName("/WEB-INF/views/Hello.jsp");
		mv.setViewName("Hello");
		mv.addObject("fname", "Ashutosh");
		mv.addObject("lname", "Mishra");
		mv.addObject("email", "ashutosh123@gmail.com");
		return mv;
	}
}
