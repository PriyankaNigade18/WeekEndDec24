package com.Week2;

public class MethodDemo 
{
	
	
	public void accept()
	{
		System.out.println("This is instance method....");
	}

	/*
	 * Static method we can call by its class name and in same class 
	 * we can call directly means without class name
	 * 
	 */
	
	public static void display()
	{
		System.out.println("This is static method");
	}
	
	public static void main(String[] args)
	{

		display();
		MethodDemo.display();
		
		MethodDemo m1=new MethodDemo();
		m1.accept();
		//The static method display() from the type MethodDemo should be accessed in a static way
		//m1.display();


	}

}
