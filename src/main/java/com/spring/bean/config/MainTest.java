package com.spring.bean.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.testng.annotations.Test;

public class MainTest {

	@SuppressWarnings("resource")
	@Test
	public void testConfig(){
//		创建spring的IOC容器
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-bean-config.xml");
//		从容器中获取bean
		Car car=(Car) ctx.getBean("car1");
//		调用方法
		System.out.println(car);
		car=(Car) ctx.getBean("car2");
		System.out.println(car);
		car=(Car) ctx.getBean("car3");
		System.out.println(car);
		UserInfo user=(UserInfo) ctx.getBean("user");
		System.out.println(user);
		user=(UserInfo) ctx.getBean("user1");
		System.out.println(user);
		user=(UserInfo) ctx.getBean("user2");
		System.out.println(user);
		VipUser	vipuser=(VipUser) ctx.getBean("vipUser");
		System.out.println(vipuser);
		vipuser=(VipUser) ctx.getBean("vipUserUtilList");
		System.out.println(vipuser);
		BoundCustomer boundCustomer=(BoundCustomer) ctx.getBean("boundCustomer");
		System.out.println(boundCustomer);
		DataSource dataSource=(DataSource) ctx.getBean("properties");
		System.out.println(dataSource);
	}
}
