package com.spring.bean.factory;

import java.util.HashMap;
import java.util.Map;

 
/**
 * 静态工厂方法创建bean实例
 * @author Administrator
 *
 */
public class StaticFactory {
	
	static Map<String,Car> cars=new HashMap<String, Car>();
	static{
		cars.put("ford", new Car("ford", 300000));
		cars.put("audi", new Car("audi",500000));
	}
	
	public static Car getCar(String brand){
		return cars.get(brand);
	}
	
}
