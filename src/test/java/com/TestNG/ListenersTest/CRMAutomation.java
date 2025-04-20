package com.TestNG.ListenersTest;

import org.testng.annotations.AfterMethod;
import com.aventstack.chaintest.plugins.ChainTestListener;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//way1:Annotation
//@Listeners(com.TestNG.ListenersTest.AppListerners.class)
//@Listeners(ChainTestListener.class)
public class CRMAutomation extends Baseclass
{
	//WebDriver driver;
	
	
  @Test(priority=1)
  public void testSignInLinkValidation() 
  {
	  ChainTestListener.log("Test Is Runng for SignIn");
	  driver.findElement(By.linkText("Sign In")).click();
  }
  
  @Test(priority=2)
  public void testLogin() 
  {
	  ChainTestListener.log("Test Is Runng forLogin");
	  //explicitly making fail test case
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-id##")).click();
	  
  }
  
  
  @Test(priority=3)
  public void testSignOutLinkValidation() 
  {
	  ChainTestListener.log("Test Is Runng for SignOut");
	  driver.findElement(By.linkText("Sign Out")).click();
  }
  
 

}
