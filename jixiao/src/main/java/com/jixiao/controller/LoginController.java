package com.jixiao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jixiao.service.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/login")
	public String login(){
		loginService.test();
		return "test";
	}

}
