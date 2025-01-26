package com.OOP.Inheritance;

public class TestCar {

	public static void main(String[] args)
	{
		System.out.println("Child class ref and child class object");
		BMW b1=new BMW();
		b1.start();//inherited
		b1.refule();//inherited
		b1.stop();//inherited
		b1.autoEngine();//individual
		b1.breakFeature();//inherited
		b1.price();
		System.out.println("**********************");
		Audi a1=new Audi();
		a1.start();//inherited
		a1.refule();//inherited
		a1.stop();//inherited
		a1.autoGear();//individual
		a1.breakFeature();//inherited
		a1.price();
		
	System.out.println("Parent class ref and Parent class object");

		Car c1=new Car();
		c1.start();
		c1.refule();
		c1.stop();
		c1.breakFeature();//inherited
		c1.price();
		System.out.println("Parent class ref and child class object");

		Car c2=new Audi();
		c2.start();
		c2.refule();
		c2.stop();
		c2.breakFeature();//inherited
		c2.price();
		
		
		
	}

}
