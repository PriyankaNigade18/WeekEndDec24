package com.OOP.Polymorphism;

public class MainFunctionOverloading 
{

	

	
	public static void main(int[] args)//args={10,20,30};
	{
		System.out.println("Main() calling using int");
		
		for(int i:args)
		{
			System.out.println(i);
		}

	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Main() calling using String");
		int arr[]= {10,20,30};
		main(arr);
	}
}
