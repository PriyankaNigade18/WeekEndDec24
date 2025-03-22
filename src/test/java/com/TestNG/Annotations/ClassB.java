package com.TestNG.Annotations;

import org.testng.annotations.Test;

public class ClassB extends BaseTestSuite
{
  @Test
  public void testCaseB1() 
  {
	  System.out.println("ClassB...testCase1");
  }
  
  @Test
  public void testCaseB2() 
  {
	  System.out.println("ClassB...testCase2");
  }
}
