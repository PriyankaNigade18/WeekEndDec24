package com.TestNG.Annotations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class RealTimeAnnotationUseCase extends BaseClass 
{
	//WebDriver driver;
	
//	@BeforeClass
//	public void setUp()
//	{
//		 driver=new ChromeDriver();
//		 driver.get("https://automationplayground.com/crm/");
//	}
	
	
	@Test(priority=1)
	public void signInLinkValidation()
	{
		//signIn link validation
		  WebElement signInlink=driver.findElement(By.linkText("Sign In"));
		  if(signInlink.isDisplayed() && signInlink.isEnabled())
		  {
			  signInlink.click();
			  
		  }

		  System.out.println("Test1.....SignIn Validation completed!");
		  
		
	}	
		
  @Test(priority=2)
  public void testLogin()
  {
	  
	  //login
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("remember")).click();
	  driver.findElement(By.id("submit-id")).click();
	  System.out.println("Test2.....login Validation completed!");

	 	  
  }
  
  @Test(priority=3)
  public void signOutValidation()
  {
	  //signOut
	  driver.findElement(By.linkText("Sign Out")).click();
	  System.out.println("Test3.....SignOut Validation completed!");

  }
  
//  @AfterClass
//  public void tearDown()
//  {
//	  driver.quit();
//  }
}
