package com.Week3;

public class MethodCalling
{
	public void startApp()
	{
		System.out.println("Application Started!");
		runApp();
	}
	
	public void runApp()
	{
		System.out.println("Application Run!");
		stopApp();
	}
	
	public void stopApp()
	{
		System.out.println("Application Stopped!");
		//startApp();//java.lang.StackOverflowError
	}

	public static void main(String[] args) 
	{
		MethodCalling obj=new MethodCalling();
		obj.startApp();

	}

}
