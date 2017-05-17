package com.spring.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.autowire.Address;
import com.spring.bean.autowire.Car;
import com.spring.bean.autowire.UserInfo;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		创建spring的IOC容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-bean-scope.xml");
		Car address=(Car) ctx.getBean("car");
		System.out.println(address);
		Car address1=(Car) ctx.getBean("car");
		System.out.println(address1);
	}

}
