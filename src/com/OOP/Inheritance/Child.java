package com.OOP.Inheritance;

public class Child extends Parent 
{
	/*
	 * Method will Override only when two class are in relation(IS-A)
	 * and same name method with same syntax declare in both the classes 
	 * then Parent class method will overrides by child class
	 * 
	 * Purpose: Updated result
	 */
	@Override
	public void color()
	{
		System.out.println("Blue");
	}

	public static void main(String[] args)
	{
		//child class ref and child class object
		Child c1=new Child();
		c1.color();//Blue
		
		//parent ref and parent object
		
		Parent p1=new Parent();
		p1.color();//red
		
		//parent ref and child object
		
		Parent p2=new Child();
		p2.color();//Blue
		
		
		
		
		
		
		

	}

}
