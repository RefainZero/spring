package com.spring.bean.factory;

import java.util.Map;

public class StaticFactory {
	

	public static Map<String,Car> car=null;
	static{
		car.put("ford", new Car("ford",30000));
		car.put("audi", new Car("audi",40000));
	}
	public Car getCar(String name){
		return car.get(name);
	}
}
