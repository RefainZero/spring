package com.spring.bean.annotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.spring.bean.annotation.service.UserService;

/**
 * 展示层（表现层）
 * @author Administrator
 *
 */
@Controller
public class UserController {

	@Autowired
	private UserService userService;
	public void execute(){
		userService.save();
		System.out.println("UserController execute......");
	}
}
 