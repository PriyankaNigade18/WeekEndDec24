package com.MouseOperatios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragnDropAction {
  @Test
  public void testDragandDrop()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://jqueryui.com/droppable/#default");
	  
	  driver.manage().window().maximize();
	  
	  //handle frame
	  driver.switchTo().frame(0);
	  
	  //ele1
	  WebElement src=driver.findElement(By.id("draggable"));
	  
	  WebElement dest=driver.findElement(By.id("droppable"));
	  
	  
	  Actions act=new Actions(driver);
	  act.dragAndDrop(src,dest).perform();
	  
	  
	  
	  
	  
  }
}
