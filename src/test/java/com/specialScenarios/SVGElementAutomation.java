package com.specialScenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SVGElementAutomation {
  @Test
  public void testHRMSVG() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	 List<WebElement> list=driver.findElements(By.xpath("//*[name()='svg']"));
	  System.out.println("Total SVG elements are: "+list.size());
	  
	  
	  for(WebElement i:list)
	  {
		  
		  i.click();
		  break;
	  }
	  
	  
	  
	  
	  
  }
  
  
  @Test
  public void testAutomationSVG()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  
	  List<WebElement> list=driver.findElements(By.xpath("//div[@class='svg-container']//*[name()='svg']//child::*"));
	  
	 System.out.println("Total SVG elements : "+list.size());//3
	 
	 
	 for(WebElement i:list)
	 {
		 System.out.println("Shape is: "+i.getTagName());
		 System.out.println("Color is: "+i.getDomAttribute("fill"));
	 }
	  
	  
  }
}
