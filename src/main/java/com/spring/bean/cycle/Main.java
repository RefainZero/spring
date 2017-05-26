package com.spring.bean.cycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring-bean-cycle.xml");
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		// 销毁ioc容器的bean
		ctx.close();
	}
}
