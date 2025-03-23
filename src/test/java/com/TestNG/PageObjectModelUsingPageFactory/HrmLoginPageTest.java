package com.TestNG.PageObjectModelUsingPageFactory;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HrmLoginPageTest extends BaseClass
{
  @Test(priority=1)
  public void validateUrl() 
  {
	  String actUrl=lp.getAppUrl();
	  Assert.assertTrue(actUrl.contains("live"));
	  System.out.println("Url matched...."+actUrl);
  }
  
  @Test(priority=2)
  public void validateLogin() 
  {
	 lp.doLogin("Admin","admin123"); 
	 Assert.assertTrue(lp.getAppUrl().contains("dashboard"));
	 System.out.println("Login Completed!");
  }
}
