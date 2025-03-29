package com.TestNG.DataPassingUp.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Generic.PropertiesUtil;

public class HrmDatapassingUsingPropertiesfile {
  @Test
  public void testLogin() throws InterruptedException 
  {
	  PropertiesUtil prop=new PropertiesUtil("config");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(prop.getData("url"));
	  
	  driver.findElement(By.name("username")).sendKeys(prop.getData("user"));
	  driver.findElement(By.name("password")).sendKeys(prop.getData("password"));
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  Thread.sleep(2000);
	  //validation
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail!");
	  System.out.println("Login Completed!");
	  
	  
	  
	  
  }
}
