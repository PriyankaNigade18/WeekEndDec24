package com.Week3.ControlFlowStatements;

import java.util.Scanner;

public class LoopDemo {

	public static void main(String[] args)
	{
		//Print Hello statement 5 time
		
		for(int i=1;i<=5;i++)
		{
			System.out.println("Hello All");
		}

		
		System.out.println("************");
		
		//print 1 to 10 numbers
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		System.out.println("************");

		//print 10 to 1
		for(int i=10;i>=1;i--)
		{
			System.out.println(i);
		}
		
		System.out.println("************");

//		for(;;)//be default the condition is true
//		{
//			System.out.println("Hi");
//		}
		
		//Sum of first 100 natural numbers =5050
		
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
		}
		
		System.out.println("Sum of 100 natural numbers: "+sum);
		
		System.out.println("****************************");
		
		//While loop
		
		int i=1;
		
		while(i<=5)
		{
			System.out.println("Hello");
			i++;
		}
		
		System.out.println("****************************");
		
		//sum of digits num=123=1+2+3=6
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int temp=num;
		
		int rem,res=0;
		
		//for digits --loop
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			res=res+rem;
		}
		
		
		System.out.println("Sum of digits of "+temp+": "+res);
		
		System.out.println("********************************");
		
		
		int no=123,r,result=0;
		
		while(no>0)
		{
			r=no%10;
			no=no/10;
			result=result*10+r;
		}
		
		System.out.println("Reverse number is: "+result);
		
		System.out.println("********************************");

		
		//do while-exit control loop
		int x=1;
		do 
		{
			System.out.println("Welcome All!");
			x++;
			
		}while(x<=10);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
