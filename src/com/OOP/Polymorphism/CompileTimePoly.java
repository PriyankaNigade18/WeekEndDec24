package com.OOP.Polymorphism;

public class CompileTimePoly 
{
	/*
	 * Method Overloading is a process where we can reuse same name method
	 * in same class multiple number of time with different signature
	 * 1.Number of arguments
	 * 2.Different type of argument
	 * 3.Change order of argument
	 * 
	 * In java Constructor overloading is possible but not overriding
	 * In Java + operator overloading is possible
	 * Main() overloading is also possible but practically not required
	 * 
	 */

	public void add()//0 parameter
	{
		int a=100,b=90;
		System.out.println("Addition is: "+(a+b));
	}
	
	//1.Number of arguments
	public void add(int a,int b)
	{
	System.out.println("Addition is: "+(a+b));
	}
	
	//2.Different type of argument
	public void add(double a,int b)
	{
	System.out.println("Addition is: "+(a+b));
	}
	
	//3.Change order of argument
	public void add(int a,double b)
	{
	System.out.println("Addition is: "+(a+b));
	}
	
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	//constructors
	public CompileTimePoly()
	{
		System.out.println("default constructor calling!");
	}
	
	public CompileTimePoly(int id)
	{
		System.out.println("parameterized constructor calling!: id: "+id);
	}
	public CompileTimePoly(String name)
	{
		System.out.println("parameterized constructor calling!: name: "+name);
	}
	
	
	public static void main(String[] args) 
	{
		CompileTimePoly obj=new CompileTimePoly();
		obj.add();
		obj.add(190.34,900);
		obj.add(23,89.77);
		obj.add(67,890);
		System.out.println("Addition is: "+obj.add(78,900,70));
		
		CompileTimePoly obj2=new CompileTimePoly(200);


	}

}
