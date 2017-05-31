package com.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;
/**
 * 	通过实例工厂方法创建bean
 * @author Administrator
 *
 */
public class CarFactoryBean {

	Map<String,Car>cars=new HashMap<String,Car>();
	
	public CarFactoryBean() {
		// TODO Auto-generated constructor stub
		cars.put("ford", new Car("ford", 300000));
		cars.put("audi", new Car("audi",500000));
	}
	
	public  Car getCar(String brand){
		return cars.get(brand);
	}
}
