package com.TestNG.Annotations;

import org.testng.annotations.*;

public class BaseTestSuite
{
	//<test> : collection of classes
	@BeforeTest
	public void btest()
	{
		System.out.println("BeforeTest executes before only first class ");
		
	}

	@AfterTest
	public void atest()
	{
		System.out.println("AfterTest executes after only last class ");
		
	}
	
	
	//<suite>: Collection of test
	/*
	 * <suite>
	 * <test>
	 * </test>
	 * 
	 * <test>
	 * </test>
	 * 
	 * <test>
	 * </test>
	 * </suite>
	 */
	
	@BeforeSuite
	public void bsuite()
	{
		System.out.println("Before suite executes only before first test");
	}
	
	
	@AfterSuite
	public void asuite()
	{
		System.out.println("After suite executes only after last test");
	}
	
	
	
	
	
}
