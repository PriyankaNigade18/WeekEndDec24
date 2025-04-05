package com.TestNG.DataDrivenFrameworkUp.copy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HRMLoginDataDrivenTest
{
  //@Test(dataProvider = "appData",dataProviderClass =CustomData.class )
  @Test(dataProvider = "excelData",dataProviderClass =CustomData.class )
  public void testLogin(String un,String psw)
  { 
	  WebDriver driver=new ChromeDriver();
  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  
  driver.findElement(By.name("username")).sendKeys(un);
  driver.findElement(By.name("password")).sendKeys(psw);
  driver.findElement(By.xpath("//button[@type='submit']")).click();
  
  //validation
  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail!");
  System.out.println("Login Completed!");
  
  
	  
  }
}
