package com.SwagLab.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;

import org.testng.annotations.Test;

public class T4_CheckoutTest extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		addWait();
		ip.addProductToCart(prop.getData("pname1"));
		addWait();
		cp=ip.launchCartPage();
		addWait();
		ch=cp.launchCheckoutPage();
		addWait();
	}
	
	
	@Test(priority=1)
	  public void validateCancelProcess() 
	  {
		  cp=ch.doCancel();
		  addWait();
		  cp.launchCheckoutPage();
		  addWait();
	  }
	
	
  @Test(priority=2)
  public void validateCheckOutProcess() 
  {
	  ch.doContinue(prop.getData("fn"),prop.getData("ln"),prop.getData("pc"));
	  addWait();
	  Assert.assertTrue(lp.getAppUrl().contains("step"));
	  System.out.println("Checkout process completed!");
  }
  
  
}
