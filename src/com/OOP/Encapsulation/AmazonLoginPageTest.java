package com.OOP.Encapsulation;

public class AmazonLoginPageTest {

	public static void main(String[] args) 
	{

		LoginPage user1=new LoginPage();
		user1.setUsername("Priyanka");
		user1.setPassword("test123");
		user1.doLogin(user1.getUsername(),user1.getPassword());

		System.out.println("**********************");
		LoginPage user2=new LoginPage();
		user2.setUsername("Sarang");
		user2.setPassword("test123");
		user2.doLogin(user2.getUsername(),user2.getPassword());
		
	}

}
