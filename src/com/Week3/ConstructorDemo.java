package com.Week3;



/*
 * Constructor is used to initialize Object
 * Constructor call is always at the time of Object Creation
 * Constructor name is similar to class name
 * constructor should not have any return type
 * constructor not allowed static,final,abstract
 * Constructor Overloading is possible but overriding is not possible
 * 
 * 
 * 2Types
 * ============
 * 1.Default c--->JVM
 * 2.Parameterized
 */
public class ConstructorDemo 
{
 //instance
	int id;
	String name;
	
	//constructor-default
	public ConstructorDemo()
	{
		System.out.println("Default constructor is calling!");
		System.out.println(id);
		System.out.println(name);
	}
	
	public ConstructorDemo(int i,String n)//2 parameters i and n are local
	{ //instance=local
		id=i;
		name=n;
		
		System.out.println("Parameterized constructor called!");
		System.out.println(id);
		System.out.println(name);
	}
	
	public void show()
	{
		System.out.println(id);
		System.out.println(name);
	}
	public static void main(String[] args)
	{
		//calling
		ConstructorDemo c1=new ConstructorDemo();
		
		ConstructorDemo c2=new ConstructorDemo(10,"Kiran");
		
		c2.show();

	}

}
