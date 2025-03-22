package com.TestNG.Annotations;

import org.testng.annotations.*;
import org.testng.annotations.Test;

public class AnnotationBasics
{
  @Test(priority=1)
  public void signInLinkValidation()
  {
	  System.out.println("Test1..Tested SignIn link.....");
  }
  
  @Test(priority=2)
  public void signInValidation()
  {
	  System.out.println("Test2...Tested SignIn functionality.....");
  }
  
  @Test(priority=3)
  public void signOutValidation()
  {
	  System.out.println("Test3...Tested signOut link fucnationality.....");
  }
  
  //rules
  @BeforeMethod
  public void bmethod()
  {
	  System.out.println("BeforeMethod executes before every test case!");
  }
  
  @AfterMethod
  public void amethod()
  {
	  System.out.println("AfterMethod executes after every test case!");
  }
  
  @BeforeClass
  public void bclass()
  {
	  System.out.println("BeforeClass executes before first test case!");
  }
  
  @AfterClass
  public void aclass()
  {
	  System.out.println("AfterClass executes after last test case!");
  }
}
