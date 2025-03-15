package com.WaitStrategyInSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class ExplicitWaitUsingWebDriverWaitClass {
  @Test
  public void testExplicitWait() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

	  //By locator
	  By email=By.id("input-email");
	  By password=By.name("password");
	  By loginBtn=By.xpath("//input[@value='Login']");
	  
	  Utility.waitForPresenceOfElement(driver,email).sendKeys("test123@gmail.com");
	  
	  Utility.waitForPresenceOfElement(driver,password).sendKeys("test123");
	  
	  Utility.waitForElementToBeClickable(driver,loginBtn).click();
	  
	  
	  
	  
	  /*
	   * TimeoutException: Expected condition failed:
	   *  waiting for presence of element located by:
	   *  By.id: input-email#### 
	   *  (tried for 5 second(s) with 500 milliseconds interval)
	   *  interval time=polling time
	   *  default polling time support by selenium 500ms==>0.5sec
	   */
	  /*
	  //explicit wait
	  WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement emailele=wait1.until(ExpectedConditions.presenceOfElementLocated(email));
	  
	  emailele.sendKeys("test@gmail.com");
	  
	  
	  //password
	  WebDriverWait wait2=new WebDriverWait(driver,Duration.ofSeconds(5));
	  WebElement passwordele=wait2.until(ExpectedConditions.visibilityOfElementLocated(password));
	  
	  passwordele.sendKeys("test123");
	  
	  
	  //button
	  WebDriverWait wait3=new WebDriverWait(driver,Duration.ofSeconds(5));
	  wait3.until(ExpectedConditions.elementToBeClickable(loginBtn)).click();
  
  */
  
  
  
  
  }
}
