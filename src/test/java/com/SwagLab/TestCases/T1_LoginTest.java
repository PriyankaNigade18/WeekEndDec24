package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;

public class T1_LoginTest extends BaseClass 
{
  @Test(priority=1)
  public void validateUrl() 
  {
	  String actUrl=lp.getAppUrl();
	  AssertJUnit.assertTrue(actUrl.contains("https"));
	  System.out.println("Url is valid..."+actUrl);
  }
  
  @Test(priority=2)
  public void validateLogin() 
  {
	  lp.doLogin(prop.getData("un"),prop.getData("psw"));
	  AssertJUnit.assertTrue(lp.getAppUrl().contains("inventory"));
	  System.out.println("Login successfull!");
  }
}
