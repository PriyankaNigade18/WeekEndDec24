package com.SwagLab.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;

import org.testng.annotations.Test;

public class T3_CartTest extends BaseClass
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
	}
	
  @Test(priority=1)
  public void verifyCartQuantity() 
  {
	  System.out.println("Product Quantity is: "+cp.getProductQuantity());
  }
  
  @Test(priority=2)
  public void verifyProductRemove() 
  {
	  cp.clickOnRemoveButton();
	  addWait();
	  System.out.println("product Removed from cart");
  }
  
  
  @Test(priority=3)
  public void validateContinueShopping()
  {
	  ip=cp.clickOnContinueShopping();
	  addWait();
	  ip.addProductToCart(prop.getData("pname2"));
	  addWait();
	  cp=ip.launchCartPage();
  }
  
  @Test(priority=4)
  public void verifyLauchOfCheckOutPage()
  {
	  cp.launchCheckoutPage();
	  addWait();
	  Assert.assertTrue(lp.getAppUrl().contains("checkout"));
	  System.out.println("Page Open Successfully");
  }
}
