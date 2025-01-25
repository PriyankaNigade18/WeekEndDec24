package com.Week2;

import java.util.Scanner;

public class Assignment
{

	public void details(String fn,String ln,String add,char ch,int age,int pin)
	{
		System.out.println("Your details are:");
		System.out.println("First name is: "+fn);
		System.out.println("last name is: "+ln);
		System.out.println("Address is: "+add);
		System.out.println("Gender is: "+ch);
		System.out.println("Age is: "+age);
		System.out.println("Pin code  is: "+pin);
		
		
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first name");
		String fname=sc.nextLine();
		System.out.println("Enter last name");
		String lname=sc.nextLine();
		System.out.println("Enter your address");
		String add=sc.nextLine();
		System.out.println("Enter your gender(M/F)");
		char gen=sc.nextLine().charAt(0);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter pin code");
		int pin=sc.nextInt();
		
		Assignment obj=new Assignment();
		obj.details(fname,lname, add, gen, age, pin);
		
		
		
		
	}

}
