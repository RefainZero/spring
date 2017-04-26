package com.spring.bean.autowire;

public class UserInfo {

	private String name;;
	private int age;
	private Street street;
	private Car car;
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
	public Street getStreet() {
		return street;
	}
	public void setStreet(Street street) {
		this.street = street;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", street=" + street
				+ ", car=" + car + "]";
	}
}
