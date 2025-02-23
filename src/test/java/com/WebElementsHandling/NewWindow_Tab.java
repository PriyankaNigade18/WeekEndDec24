package com.WebElementsHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewWindow_Tab {
  @Test
  public void testNewWindow_Tab() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  
	  //new tab
	  WebDriver newTab=driver.switchTo().newWindow(WindowType.TAB);
	  newTab.get("https://www.facebook.com");
	  
	  
	  //newWindow
	  WebDriver newWin=newTab.switchTo().newWindow(WindowType.WINDOW);
	  newWin.get("https://www.amazon.in");
	  
	  
	  
  }
}
