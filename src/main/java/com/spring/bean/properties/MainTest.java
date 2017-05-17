package com.spring.bean.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-bean-properties.xml");
		DbProperties db=(DbProperties) ctx.getBean("datasource2");
		System.out.println(db);
//		db=(DbProperties) ctx.getBean("datasource2");
//		System.out.println(db);
	}

}
