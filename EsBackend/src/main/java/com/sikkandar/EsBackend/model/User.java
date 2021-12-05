package com.sikkandar.EsBackend.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class User {
	private String userName;
	private String password;
	private boolean isValidated;
	
	public User() {}
	
	public User(String userName, boolean isValidated) {
        this.userName = userName;
        this.isValidated = isValidated;
    }
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean isValidated() {
		return isValidated;
	}
	public void setValidated(boolean isValidated) {
		this.isValidated = isValidated;
	}
}
