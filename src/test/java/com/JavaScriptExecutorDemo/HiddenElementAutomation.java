package com.JavaScriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenElementAutomation {
  @Test
  public void testHiddenElement()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.letskodeit.com/practice");
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  
	  //click on hide
	  driver.findElement(By.id("hide-textbox")).click();
	  
	  //hidden element-input box-ElementNotInteractableException: element not interactable
	  //driver.findElement(By.id("displayed-text")).sendKeys("Hello");
	  
	  js.executeScript("document.getElementById('displayed-text').value='Hello';");
	  
	  
	  
  }
  
}
