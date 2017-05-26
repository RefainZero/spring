package com.spring.bean.cycle;

public class Car {

	private String name;
	public void setName(String name) {
		System.out.println("set name......");
		this.name = name;
	}
	
	public void init(){
		System.out.println("init.....");
	}
	
	public void destory(){
		System.out.println("destory.....");
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + "]";
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("car constructor......");
	}
}
