package com.spring.bean.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean-carfactorybean.xml");
		Car car = (Car) ctx.getBean("carFactoryBean");
		System.out.println(car);
	}
}
