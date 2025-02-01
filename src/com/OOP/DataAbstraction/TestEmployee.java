package com.OOP.DataAbstraction;

public class TestEmployee extends EmployeeData
{

	public void display()
	{
		System.out.println("display().......TestEmployee class");
	}
	
	@Override
	public void show() {

		System.out.println("Show().....Implemented by child class");
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Scenario1: Child class ref and child class object");

		TestEmployee t1=new TestEmployee();
		t1.accept();//inherited
		t1.display();//individual
		t1.show();//inherited abstract
		
		System.out.println("Scenario2: parent class ref and child class object");
		EmployeeData e1=new TestEmployee();
		e1.accept();
		e1.show();
		
		
		
	}
	

}
