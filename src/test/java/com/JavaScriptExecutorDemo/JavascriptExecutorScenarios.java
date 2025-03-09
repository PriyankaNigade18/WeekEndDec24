package com.JavaScriptExecutorDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptExecutorScenarios {
  @Test
  public void testJs() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  //title
	  System.out.println(driver.getTitle());
	  String title=js.executeScript("return document.title").toString();
	  System.out.println(title);
	  
	  //refresh page
	  driver.navigate().refresh();
	  
	  Thread.sleep(3000);
	  
	  js.executeScript("window.history.go()");
	  
	  //alert generation
	  js.executeScript("alert('Hello This is js alert')");
	  
	 //handle alert
	  driver.switchTo().alert().accept();
	  
	  
	  //click on cart
	 // driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]")).click();
	  WebElement cartEle=driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]"));
	  
	  js.executeScript("arguments[0].click();",cartEle);
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
