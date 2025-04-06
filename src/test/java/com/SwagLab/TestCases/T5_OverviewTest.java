package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;

import org.testng.annotations.Test;

public class T5_OverviewTest extends BaseClass
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
		op=ch.doContinue(prop.getData("fn"),prop.getData("ln"),prop.getData("pc"));
		addWait();
	}
	
	
	
	
	
  @Test(priority=1)
  public void verifyProductDetails()
  {
	  System.out.println("Purches Product deatails: "+op.getProductDetail());
  }
  
  @Test(priority=2)
  public void verifyPaymentDetails() 
  {
	  op.getPaymentInfomartion();
  }
  
  @Test(priority=3)
  public void verifyShippingDetails()
  {
	  op.getShippingInformation();
  }
  
  @Test(priority=4)
  public void verifyTotal() 
  {
	  op.getPriceDetails();
  }
  
  @Test(priority=5)
  public void validateCompleteCheckoutProcess()
  {
	  String message=op.doFinish();
	  System.out.println(message);
  }
}
