package com.spring.bean.properties;

public class DbProperties {

	private String userName;
	private String passWord;
	private String jdbcUrl;
	private String driverClass;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getJdbcUrl() {
		return jdbcUrl;
	}
	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}
	public String getDriverClass() {
		return driverClass;
	}
	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}
	@Override
	public String toString() {
		return "DbProperties [userName=" + userName + ", passWord=" + passWord
				+ ", jdbcUrl=" + jdbcUrl + ", driverClass=" + driverClass + "]";
	}
	
}
