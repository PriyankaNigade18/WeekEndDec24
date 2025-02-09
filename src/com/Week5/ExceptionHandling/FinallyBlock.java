package com.Week5.ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args) 
	{
		/*
		 * finally block is used to execute special code
		 * with or without exception
		 */

		
		try {
			System.out.println(9/0);	
		}catch(ArithmeticException a)
		{
			System.out.println("Please enter other number than 0");
		}
		finally
		{
			System.out.println("finally block executed!");
		}

	}

}
