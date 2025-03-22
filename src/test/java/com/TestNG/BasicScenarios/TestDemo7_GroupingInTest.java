package com.TestNG.BasicScenarios;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo7_GroupingInTest 
{
  @Test(priority=1,groups="SmokeTest")
  public void registerTest()
  {
	  System.out.println("User register here!");
  }
  
  @Test(priority=2,groups="SmokeTest")
  public void loginTest()
  {
	  System.out.println("User login here!");
  }
  
  @Test(priority=3,groups="RegressionTest",dependsOnGroups = "SmokeTest")
  public void searchProductTest()
  {
	  System.out.println("User search product here!");
  }
  
  @Test(priority=4,groups="RegressionTest")
  public void addToCartTest()
  {
	  System.out.println("User added product here!");
  }
  
  @Test(priority=5,groups="FunctionalTest")
  public void paymentTest()
  {
	  System.out.println("User completed the payment here!");
  }
  
  @Test(priority=6,groups="FunctionalTest")
  public void logoutTest()
  {
	  System.out.println("User logout here!");
  }
}
