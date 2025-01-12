package com.Week3.ControlFlowStatements;

public class NestedLoop {

	public static void main(String[] args) 
	{

		//print table of a number
		
		int num=2;
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(num*i);
		}

		System.out.println("***********************");
		
		//print 1 to 10 tables
		for(int n=1;n<=10;n++)
		{
			for(int i=1;i<=10;i++)
			{
				System.out.print(n*i+"\t");
			}
			System.out.println();
			
		}
		
		
		System.out.println("***********************");
		
		
		for(int r=1;r<=4;r++)//row
		{
			
			for(int c=1;c<=4;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("***********************");

		for(int r=1;r<=4;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("*************************");
		
	//print all even numbers upto 20
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even number: "+i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
	}

}
