package com.OOP.Inheritance;

public class Audi extends Car
{
	
	public void autoGear()
	{
		System.out.println("Audi....autoGear()");
	}

	@Override
	public void price()
	{
		System.out.println("Car.....price 40L()");
	}
}
