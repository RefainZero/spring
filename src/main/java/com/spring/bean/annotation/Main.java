package com.spring.bean.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.annotation.controller.UserController;
import com.spring.bean.annotation.repository.UserRepository;
import com.spring.bean.annotation.service.UserService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean-annotation.xml");
//		TestObject testObject = (TestObject) ctx.getBean("testObject");
//		System.out.println(testObject);
		UserController userController = (UserController) ctx.getBean("userController");
		userController.execute();
//		UserService userService = (UserService) ctx.getBean("userService");
//		System.out.println(userService);
//		UserRepository userRespository = (UserRepository) ctx.getBean("userRespository");
//		System.out.println(userRespository);
	}

}
