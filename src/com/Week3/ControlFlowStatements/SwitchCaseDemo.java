package com.Week3.ControlFlowStatements;

import java.util.Scanner;

public class SwitchCaseDemo {

	public static void main(String[] args)
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a browser");
		String bname=sc.nextLine();
		
		/*
		 * toUpperCase()   toLowerCase()
		 */
		switch(bname.toLowerCase())
		{
		case "chrome":
			System.out.println("Test case is executing on chrome");
			break;
		case "edge":
			System.out.println("Test case is executing on Edge");
			break;
		case "firefox":
			System.out.println("Test case is executing on firefox");
			break;
			
			default:
				System.out.println("Wrong browser choice!");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		System.out.println("Enter a number between 0 to 5");
		int num=sc.nextInt();
		
		switch (num)
		{
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		case 4:
			System.out.println("Four");
			break;
		case 5:
			System.out.println("Five");
			break;
		default:
			System.out.println("Wrong Number!");
			break;
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
