package com.oss.carpool.domain;

public class Test {
	String userID;
	String password;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Test [userID=" + userID + ", password=" + password + "]";
	}
	
	
}
