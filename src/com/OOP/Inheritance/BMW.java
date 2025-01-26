package com.OOP.Inheritance;

public class BMW extends Car
{
	
	public void autoEngine()
	{
		System.out.println("BMW.....autoEngine()");
	}

	@Override
	public void price()
	{
		System.out.println("BMW.....price 50L()");
	}
}
