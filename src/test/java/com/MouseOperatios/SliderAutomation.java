package com.MouseOperatios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderAutomation {
  @Test
  public void testSlider()
  {WebDriver driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  
  driver.get("https://jqueryui.com/slider/");
  
  
  driver.switchTo().frame(0);
  
  //ele
  WebElement ele=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
  
  
  Actions act=new Actions(driver);
  act.clickAndHold(ele).moveToElement(ele,200,0).build().perform();
  
  
  
  
  }
}
