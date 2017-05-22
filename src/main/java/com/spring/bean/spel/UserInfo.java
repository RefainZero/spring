package com.spring.bean.spel;

public class UserInfo {

	private String name;
	private Car car;
	private String city;
	private String info;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", car=" + car + ", city=" + city
				+ ", info=" + info + "]";
	}
	
}
