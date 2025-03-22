package com.TestNG.Annotations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.*;

public class BaseClass 
{
	public WebDriver driver;

	@BeforeClass
	public void setUp()
	{
		 driver=new ChromeDriver();
		 driver.get("https://automationplayground.com/crm/");
		 System.out.println("Browser session is Created.....");
		 
	}
	
	@AfterClass
	  public void tearDown()
	  {
		  driver.quit();
			 System.out.println("Browser session is Closed.....");

	  }
	
	
	@BeforeMethod
	public void getAppUrl()
	{
		System.out.println("Url is: "+driver.getCurrentUrl());
	}
	
	@AfterMethod
	public void getAppTitle()
	{
		System.out.println("Title is: "+driver.getTitle());
	}
}
