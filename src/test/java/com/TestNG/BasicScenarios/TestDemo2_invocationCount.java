package com.TestNG.BasicScenarios;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo2_invocationCount
{
  @Test(priority=1)
  public void testRegister() 
  {
	  System.out.println("Test 1 for Register");
  }
  
  
  @Test(priority=2,invocationCount=3)
  public void testLogin() 
  {
	  System.out.println("Test 2 for Login");
  }
  
}
