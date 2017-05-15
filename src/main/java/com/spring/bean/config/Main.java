package com.spring.bean.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.autowire.Car;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		创建spring的IOC容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-bean-relation.xml");
		Car address=(Car) ctx.getBean("car");
		Car address1=(Car) ctx.getBean("car");
//		address=(Address) ctx.getBean("address2");
		System.out.println(address.equals(address1));
	}

}
