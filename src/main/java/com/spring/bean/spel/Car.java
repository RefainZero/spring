package com.spring.bean.spel;

public class Car {
	private String brand;
	private String city;
	private double price;
	private double  circle;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getCircle() {
		return circle;
	}
	public void setCircle(double circle) {
		this.circle = circle;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", city=" + city + ", price=" + price
				+ ", circle=" + circle + "]";
	}
	
	
	
}
