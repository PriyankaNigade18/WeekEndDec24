package com.MouseOperatios;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class RightClickAction {
  @Test
  public void testRightclick()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	  
	  //element
	  WebElement ele=driver.findElement(By.xpath("//span[text()='right click me']"));
	  
	  //create Actions class Object
	  Actions act=new Actions(driver);
	  act.contextClick(ele).perform();
	  
	  
	  //to get the list
	  List<WebElement> list=driver.findElements(By.xpath("(//ul)[3]//li//span"));
	  WebElement e=null;
	  for(WebElement i:list ) 
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Copy"))
		  {
			  e=i;
		  }
	  }
		  
	  e.click();
	  
	  
	  //alert will open
	  driver.switchTo().alert().accept();
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
