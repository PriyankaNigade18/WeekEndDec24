package com.WebElementsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo2_internetApp {
  @Test
  public void testAlert() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://the-internet.herokuapp.com/javascript_alerts");
	  
	  WebElement result=driver.findElement(By.id("result"));
	  
	  //alert1
	  driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	  Thread.sleep(2000);
	  
	  //alert
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert1 text is: "+alt1.getText());
	  //ok
	  alt1.accept();
	  System.out.println("Result is: "+result.getText());
	  
	  //alert2:confirmation alert
	  driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
	  Thread.sleep(2000);
	  
	  //alert
	  Alert alt2=driver.switchTo().alert();	
	  System.out.println("Alert2 text is: "+alt2.getText());
	  //cancel
	  alt2.dismiss();
	  System.out.println("Result is: "+result.getText());
	  
	  //alert3:prompt
	  driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	  Thread.sleep(2000);
	  
	  //alert
	  Alert alt3=driver.switchTo().alert();	  
	 System.out.println("Alert3 text is: "+alt3.getText());
	 //prompt
	 alt3.sendKeys("Hello All");
	 
	 //ok
	 alt3.accept();
	 
	 System.out.println("Result is: "+result.getText());
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
