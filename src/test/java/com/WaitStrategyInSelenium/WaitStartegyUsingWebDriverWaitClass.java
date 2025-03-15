package com.WaitStrategyInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class WaitStartegyUsingWebDriverWaitClass {
  @Test
  public void testExplicitWait()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");

	  
	  By startbutton=By.tagName("button");
	  By ele=By.xpath("(//h4)[2]");
	  
	  boolean urlstatus=Utility.waitForUrlContains(driver,"internet");
	  System.out.println("Url status is: "+urlstatus);
	  boolean titlestatus=Utility.waitForTitleContains(driver,"The");
	  System.out.println("Title status: "+titlestatus);
	  
	  driver.findElement(startbutton).click();
	  String text=Utility.waitForVisiblityOfElement(driver,ele).getText();
	  //String text=driver.findElement(ele).getText();
	  System.out.println(text);
  
  
  
  
  
  
  }
}
