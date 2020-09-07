package com.springMVC.intercepterEx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {
	
	@RequestMapping("/hello")
	public ModelAndView hello() {
		return new ModelAndView("hello");
	}
	
	@RequestMapping("/hi")
	public ModelAndView hi() {
		return new ModelAndView("hello");
	}
}
