package com.Week3;

public class ThisKeywrodDemo3 {

	//this() can be used to invoke current class constructor.
	//Constructor call must be the first statement in a constructor

	public ThisKeywrodDemo3()
	{
		//this(101);//parameterized constructor calling
		System.out.println("Default constaructor calling!");
		
	}
	
	public ThisKeywrodDemo3(int id)
	{
		this();//default constructor calling
		System.out.println("Parameterized constaructor calling!id is: "+id);
	}
	public static void main(String[] args)
	{

		ThisKeywrodDemo3 t1=new ThisKeywrodDemo3(101);
		
		

	}

}
