package com.spring.bean.autowire;

public class Car {

	private String brand;
	private String colour;
	private int maxSpeed;
	private double price;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", colour=" + colour + ", maxSpeed="
				+ maxSpeed + ", price=" + price + "]";
	}
	public Car(String brand, String colour, int maxSpeed) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.maxSpeed = maxSpeed;
	}
	public Car(String brand, String colour, double price) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.price = price;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
}
