package com.spring.bean.spel;

public class Car {
	private String brand;
	private double price;
	private double  circle;
	private String info;
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public double getCircle() {
		return circle;
	}
	public void setCircle(double circle) {
		this.circle = circle;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public Car() {
		// TODO Auto-generated constructor stub
		System.out.println("car's constructor...");
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", circle="
				+ circle + ", info=" + info + "]";
	}
	
	
	
}
