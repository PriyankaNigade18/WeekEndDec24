package com.Week5.ExceptionHandling;

import java.util.Scanner;

public class RuntimeExceptions {

	int id=101;
	
	public static void main(String[] args) 
	{
		RuntimeExceptions r1=new RuntimeExceptions();
		r1=null;
		try {
		System.out.println("Id is: "+ r1.id);//NullPointerException
		}catch(NullPointerException n)
		{
			System.out.println("Please check data is Unknown");
		}
		System.out.println("****************");
		
		
		String s1="100AB";
		System.out.println(s1+100);//100100
		//string to int
		try {
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		}catch(NumberFormatException e)
		{
			System.out.println("Write appropriate String data");
		}
		
		
		
		
		Scanner sc=new Scanner(System.in);
		/*
		System.out.println("Enter index value between 0-5");
		int index=sc.nextInt();
		
		int arr[]= {10,20,30,40,50,60};
		try {
		System.out.println("Array element :"+arr[index]);//ArrayIndexOutOfBoundsException
		}catch(Exception a)
		{
			System.out.println("Please enter valid index number!");
		}
		*/
		
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		try {
		System.out.println("Division is: "+(a/b));//ArithmeticException
		}catch(Exception i)
		{
			System.out.println("Please enter number other than zero");
		}
		System.out.println("Multiplication is: "+(a*b));
		


	}

}
