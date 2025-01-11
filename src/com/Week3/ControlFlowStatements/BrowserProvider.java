package com.Week3.ControlFlowStatements;

import java.util.Scanner;

public class BrowserProvider {

	public static void main(String[] args) 
	{
		/* 
		 * String is class in java
		 * string validation we use methods
		 * string comparison
		 * -------------------
		 * 1.equals()-test for exact match and this is case sensitive
		 * 2.equalsIgnoreCase()- test for exact match and this is case insensitive
		 
		
		
		String act="Hello All";
		String exp="Hello All!";
		System.out.println(act.equals(exp));//true-->false--false
		System.out.println(act.equalsIgnoreCase(exp));//true-->true--false
		*/
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a browser name ");
		String bname=sc.nextLine();
		
		if(bname.equalsIgnoreCase("chrome"))
		{
			System.out.println("Test case is executing on Chrome");
		}else if(bname.equalsIgnoreCase("edge"))
		{
			System.out.println("Test case is executing on Edge");

		}else if(bname.equalsIgnoreCase("firefox"))
		{
			System.out.println("Test case is executing on Firefox");

		}else
		{
			System.out.println("Wrong browser choice!");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
