package com.WebElementsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutomateBasicAuthentication {
  @Test
  public void testBasicAuth()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
	  
	  String text=driver.findElement(By.xpath("//div[@class='example']")).getText();
	  System.out.println(text);
	  
	  
	  
  }
}
