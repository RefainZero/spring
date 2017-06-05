package com.spring.bean.annotation.generics.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-bean-generrics.xml");
		UserService userService=(UserService) ctx.getBean("userService");
		userService.save();
	}
}
