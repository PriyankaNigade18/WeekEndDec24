package com.TestNG.DataPassingUp.copy;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class DataPassingUsingXml
{
  @Test
  @Parameters({"user","password"})
  public void testDataPassing(String un,String psw)
  {
	  System.out.println("User Name is: "+un);
	  System.out.println("Password is: "+psw);
	  
  }
}
