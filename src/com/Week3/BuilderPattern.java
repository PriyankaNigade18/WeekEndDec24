package com.Week3;

public class BuilderPattern
{
	/*
	 * this can be used to return the current class instance from the method.
	 */
	
	//method-->object
	public BuilderPattern startBroswer()
	{
		System.out.println("Browser will start!");
		return this;
	}

	public BuilderPattern runApp()
	{
		System.out.println("Application is runnig");
		return this;
	}
	public void stopBroswer()
	{
		System.out.println("Browser will stop!");
	}
	public static void main(String[] args)
	{
		BuilderPattern b1=new BuilderPattern();
		b1.startBroswer().runApp().stopBroswer();
		
		

	}

}
