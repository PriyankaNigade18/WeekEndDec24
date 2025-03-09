package com.JavaScriptExecutorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class AutomationScroll {
  @Test
  public void testScroll() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  driver.manage().window().maximize();
	  Utility.scrollDown(driver);
	  Thread.sleep(2000);
	  
	  Utility.scrollUp(driver);
	  Thread.sleep(2000);
	  
	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Best Sellers in Sports')]"));
	  Utility.scrollUpToElement(driver,ele);
	  /*
	  //convert wd object into Js object
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  
	  //scroll down
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(2000);
	  
	  //scroll up
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  
	  Thread.sleep(2000);
	  //scroll upto specific element
	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Best Sellers in Sports')]"));
	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
