package com.OOP.DataAbstraction;

public abstract class EmployeeData 
{
	
	/*
	 * Abstract class declared using abstract keyword
	 * Abstract class can have implemented and non implemented(Abstract method)
	 * Method without body is called abstract method
	 * Abstract method implemented by the child class
	 * Abstract class is not fully implemented class and so Object is not possible to create
	 * Using child class object we can access properties of Abstract class
	 * Abstract class help us to achieve partial abstraction
	 * 
	 */
	
	public void accept()
	{
		System.out.println("Accept()....Fully implemeted method");
	}
	
	//non implemented-abstract method
	public abstract void show();
	
	
	

	public static void main(String[] args)
	{
		//Cannot instantiate the type EmployeeData
		//EmployeeData e1=new EmployeeData();
		

	}

}
