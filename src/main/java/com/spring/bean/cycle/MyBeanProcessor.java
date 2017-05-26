package com.spring.bean.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessBeforeInitialization "+bean+" "+beanName);
		// TODO Auto-generated method stub
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName)
			throws BeansException {
		System.out.println("postProcessAfterInitialization "+bean+" "+beanName);
		// TODO Auto-generated method stub
		Car car=new Car();
		car.setName("balance...");
		return car;
	}

}
