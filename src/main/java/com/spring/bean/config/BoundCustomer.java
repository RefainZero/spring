package com.spring.bean.config;

import java.util.Map;

public class BoundCustomer {

	private String name;
	private int age;
	private Map<String,Car> cars;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Map<String, Car> getCars() {
		return cars;
	}
	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
	}
	@Override
	public String toString() {
		return "BoundCustomer [name=" + name + ", age=" + age + ", cars="
				+ cars + "]";
	}
	
	
}
