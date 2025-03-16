package com.TestNG.BasicScenarios;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class TestDemo3_timeOuts 
{
  @Test(timeOut = 5000)
  public void testCase1() throws InterruptedException
  {
	  System.out.println("Test1 started....");
	  Thread.sleep(4000);
	  System.out.println("Test1 completed....");
  }
  
  
  @Test(timeOut = 5000)
  public void testCase2() throws InterruptedException
  {
	  System.out.println("Test2 started....");
	  Thread.sleep(6000);
	  System.out.println("Test2 completed....");
  }
}
