package com.TestNG.BasicScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestDemo5_Assertion {
  @Test
  public void testHardAssertion()
  {
	  String act="Selenium WebDriver is WebUi automation library!";
	  String exp="TestNG";
	  
	  //String exp="Selenium WebDriver is WebUi automation tool.";
	  /*
	  //validate-Assertion-java.lang.AssertionError
	  Assert.assertEquals(act,exp,"Test Fail....as Strings are not equal!");
	  System.out.println("Test Pass...As strings are equal");
	  
	  //exp string should be part of actual string
	  Assert.assertTrue(act.contains(exp),"Test Fail....string is not a part of actual string!");
	  System.out.println("Test Pass....String is part of Actual string!");
	  
	  */
	  
	  //exp string should not be part of actual string (-ve)
	  
	  Assert.assertFalse(act.contains(exp));//true
	  System.out.println("Test Pass...When exp string is not a part of Actual string");
	  
	  
  }
  
  @Test 
  public void testSoftAssertion()
  {
	  int a=100,b=200;
	  
	  SoftAssert sf=new SoftAssert();
	  sf.assertEquals(a,b,"Test Fail....Both numbers are not equal");
	  System.out.println("Test Pass...both number are equal");
	  
	  sf.assertAll();
  }
}
