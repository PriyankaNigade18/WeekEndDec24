package com.Week2;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) 
	{

		//To accept any input from the user use Scanner class
		System.out.println("Enter your name: ");
		
		Scanner reader=new Scanner(System.in);
		
		String name=reader.nextLine();
		
		System.out.println("Hello "+name);
		
		System.out.println("Enter you id: ");
		int id=reader.nextInt();
		System.out.println("Your id is: "+id);
		
		reader.close();

	}

}
