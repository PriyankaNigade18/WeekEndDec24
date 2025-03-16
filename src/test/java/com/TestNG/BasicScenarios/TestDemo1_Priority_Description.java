package com.TestNG.BasicScenarios;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo1_Priority_Description
{
  @Test(priority=1,description="Test case forUser registration")
  public void registerTest()
  {
	  System.out.println("User register here!");
  }
  
  @Test(priority=2)
  public void loginTest()
  {
	  System.out.println("User login here!");
  }
  
  
  @Test(priority=3,description="Test case for search product")
  public void searchProductTest()
  {
	  System.out.println("User search for product here!");
  }
  
  @Test(priority=4)
  public void addToCartTest()
  {
	  System.out.println("User add product to cart here!");
  }
}
