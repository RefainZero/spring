package com.spring.bean.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class MainTest {

	@Test
	public void testConfig(){
//		创建spring的IOC容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-bean-autowire.xml");
//		从容器中获取bean
		UserInfo userInfo=(UserInfo) ctx.getBean("userInfo");
//		调用方法
		System.out.println(userInfo);
	}
}
