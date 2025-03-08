package com.WebElementsHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FrameDemo1_UIVision {
  @Test
  public void testFrame() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://ui.vision/demo/webtest/frames/");
	  
	  int total=driver.findElements(By.tagName("frame")).size();
	  System.out.println("Total Frames are: "+total);
	  
	  //switchto frame1
	  driver.switchTo().frame(0);
	  
	  //frame1 ele
	  driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Frame1");
	  
	  
	  //come to the main document
	  driver.switchTo().defaultContent();
	  
	  //frame2
	  WebElement frame2Ele= driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
	  driver.switchTo().frame(frame2Ele);
	  
	  //Frame2 --->frame2 ele
	  driver.findElement(By.name("mytext2")).sendKeys("Frame2");
	  
	  //main document
	  driver.switchTo().defaultContent();
	  
	  //frame3
	  driver.switchTo().frame(2);
	  
	  //frame3--->ele
	  WebElement frame3ele= driver.findElement(By.name("mytext3"));
	  frame3ele.sendKeys("Frame3");
	  //Nested frame concept
	  
	  //frame3--->inner frame--->radio button
	  driver.switchTo().frame(0);//innerframe
	  
	  //radio button
	  driver.findElement(By.id("i9")).click();
	  
	  //switch control from inner frame to parent
	  driver.switchTo().parentFrame();//frame3
	  
	  frame3ele.clear();
	  frame3ele.sendKeys("Hello All!");
	  
	  
	  
  }
}
