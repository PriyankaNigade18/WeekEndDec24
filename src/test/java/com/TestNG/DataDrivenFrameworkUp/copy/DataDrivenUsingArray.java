package com.TestNG.DataDrivenFrameworkUp.copy;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenUsingArray 
{
//	@DataProvider(name="appData")
//	public Object[][] testData()
//	{
//		Object data[][]= {{"Admin","admin123"},{"smita","test123"},{"parag","test123"}};
//		return data;
//	}
	
		
  @Test(dataProvider="appData",dataProviderClass = CustomData.class)
  public void testLogin(String un,String psw) 
  {
	  System.out.println("User name is: "+un);
	  System.out.println("Password is: "+psw);
  }
}
