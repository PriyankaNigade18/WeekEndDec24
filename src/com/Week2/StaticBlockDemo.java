package com.Week2;

public class StaticBlockDemo
{

	static String cname;
	
	//static block
	static 
	{
		System.out.println("Static block is calling.....");
		cname="AISSPMS";
		
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Main() is calling....");
		System.out.println("College name is: "+cname);

	}

	
}
