package com.TestNG.BasicScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo6_dependsOnMethod {
  @Test(priority=1)
  public void registerTest()
  {
	  
	  Assert.assertEquals(true,true);
	  System.out.println("User register here!");
	  
  }
  
  @Test(priority=2,dependsOnMethods = "registerTest")
  public void loginTest()
  {
	  Assert.assertEquals(true,false);//fail
	  System.out.println("User login here!");
  }
  
  @Test(priority=3,dependsOnMethods = "loginTest")
  public void logoutTest()
  {
	  Assert.assertEquals(true,true);
	  System.out.println("User logout here!");
  }
}
