package com.spring.bean.autowire;

public class Street {
	private String StreetName;
	private String cityName;
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "Street [StreetName=" + StreetName + ", cityName=" + cityName
				+ "]";
	}
}
