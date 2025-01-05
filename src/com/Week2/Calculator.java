package com.Week2;

public class Calculator 
{
	int num1=125,num2=24;
	
	public void add()
	{
		int result=num1+num2;
		System.out.println("Addition is: "+result);
	}

	
	public void sub()
	{
		int result=num1-num2;
		System.out.println("Subtraction is: "+result);
	}
	
	
	public void mul()
	{
		int result=num1*num2;
		System.out.println("Multiplication is: "+result);
	}
	
	public void div()
	{
		int result=num1/num2;
		System.out.println("Division is: "+result);
	}
	public static void main(String[] args)
	{

		Calculator c1=new Calculator();
		c1.add();
		c1.sub();
		c1.mul();
		c1.div();

	}

}
