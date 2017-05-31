package com.spring.bean.factorybean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 自定义factorybean需要实现FactoryBean接口
 * @author Administrator
 *
 */
public class CarFactoryBean implements FactoryBean<Car> {
	
	private String brand;
	public void setBrand(String brand) {
		this.brand = brand;
	}

//	返回实例对象
	@Override
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car(brand, 300000);
	}

//	返回实例类型
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

//	是否为单例模式
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
