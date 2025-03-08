package com.WebElementsHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertDemo1_Rediffmail {
  @Test
  public void testAlert() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	  
	  //username
	  driver.findElement(By.id("login1")).sendKeys("Priyanka");
	  
	  //click on Sign In button
	  driver.findElement(By.name("proceed")).click();
	  
	  Thread.sleep(2000);
	  
	  //alert will open
	  //UnhandledAlertException: unexpected alert open: {Alert text : Please enter your password}
	  
	  Alert alt1=driver.switchTo().alert();
	  System.out.println("Alert text is: "+alt1.getText());
	  alt1.accept();
	  
	  
	  //password
	  driver.findElement(By.id("password")).sendKeys("test123");
	  
	  
	  
	  
	  
	  
  }
}
