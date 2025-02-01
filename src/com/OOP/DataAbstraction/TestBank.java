package com.OOP.DataAbstraction;

public class TestBank {

	public static void main(String[] args)
	{

		
		System.out.println("Scenario1: Child class ref and child class Object:valid");
		HDFC h1=new HDFC();
		h1.custDetails();//individual
		h1.deposite();//inherited abstract method
		h1.withdraw();//inherited abstract method
		h1.rateOfInterest();//inherited abstract method
		System.out.println("Scenario2: Parent class ref and Parent class Object:Invalid");
		//RBI r1=new RBI();//Cannot instantiate the type RBI
		System.out.println("Scenario3: Parent class ref and child class Object:valid");
		RBI r1=new HDFC();
		r1.deposite();
		r1.withdraw();
		r1.rateOfInterest();
		
		
		
	}

}
