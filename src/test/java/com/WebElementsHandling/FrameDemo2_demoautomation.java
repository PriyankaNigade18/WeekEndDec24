package com.WebElementsHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameDemo2_demoautomation {
  @Test
  public void testFrame()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Frames.html");
	  int totalFrame=driver.findElements(By.tagName("iframe")).size();
	  System.out.println("Total frames available on page: "+totalFrame);
	  
	  
	  //frame with index
	 // driver.switchTo().frame(0);
	  //frame with id
	  //driver.switchTo().frame("singleframe");
	  //frame with webelement
	  WebElement framele=driver.findElement(By.name("SingleFrame"));
	  
	  driver.switchTo().frame(framele);
	     
	  //inuptbox
	  driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Hello All!");
  }
}
