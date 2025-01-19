package com.OOP.Encapsulation;

public class LoginPage
{

	//data
	private String username;
	private String password;
	
	//public method
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//business logic
	public void doLogin(String username,String password)
	{
		System.out.println("Hello You are Login : "+username);
	}
	
	
}
