package com.Week2;

import java.util.Scanner;

public class RuntimeParameterPassing
{

	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is: "+c);
	}
	
	
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	public static void main(String[] args) 
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1=sc.nextInt();
		System.out.println("Enter second number: ");
		int num2=sc.nextInt();
		
		RuntimeParameterPassing r1=new RuntimeParameterPassing();
		r1.add(num1,num2);
		int res=r1.sub(num1,num2);
		System.out.println("Subtraction is: "+res);
		
		//Method Calling techniques are left!
		

	}

}
