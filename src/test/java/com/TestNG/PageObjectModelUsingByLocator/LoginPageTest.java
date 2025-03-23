package com.TestNG.PageObjectModelUsingByLocator;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseClass
{
		
  @Test(priority=1)
  public void validateUrl() 
  {
	  //LoginPage lp=new LoginPage(driver);
	 String actUrl=lp.getAppUrl();
	 Assert.assertTrue(actUrl.contains("https"));
	 System.out.println("Url is Valid..."+actUrl);
	 
  }
  
  @Test(priority=2)
  public void validateTitle()
  {
	  //LoginPage lp=new LoginPage(driver);
	  String actTitle=lp.getAppTitle();
	  Assert.assertEquals(actTitle,"OrangeHRM");
	  System.out.println("Title matched...."+actTitle);
  }
  
  @Test(priority=3)
  public void validateLogin()
  {
	 // LoginPage lp=new LoginPage(driver);
//	  lp.setUsername("Admin");
//	  lp.setPassword("admin123");
//	  lp.clickOnLoginButton();
	  lp.doLogin("Admin","admin123");
	  Assert.assertTrue(lp.getAppUrl().contains("dashboard"),"Login Fail!");
	  System.out.println("Login successfull!");
  }
}
