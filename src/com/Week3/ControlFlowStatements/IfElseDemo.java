package com.Week3.ControlFlowStatements;

import java.util.Scanner;

public class IfElseDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		//even odd
		if(num%2==0)
		{
			System.out.println(num+" is even");
		}else
		{
			System.out.println(num+" is odd");
		}
		
		
		
		
		
		
		
		/*
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		if(age>=18)
		{
			System.out.println("Valid age!");
		}else
		{
			System.out.println("Invalid age!");
		}
*/
	}

}
