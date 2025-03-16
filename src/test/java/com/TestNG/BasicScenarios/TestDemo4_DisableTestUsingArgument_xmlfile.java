package com.TestNG.BasicScenarios;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestDemo4_DisableTestUsingArgument_xmlfile {
  

  @Test(priority=1)
  public void testChrome() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");
	  Thread.sleep(2000);
	  driver.quit();
  }
  
  
  @Test(priority=2)
  public void testEdge() throws InterruptedException
  {
	  WebDriver driver=new EdgeDriver();
	  driver.get("https://www.facebook.com");
	  Thread.sleep(2000);
	  driver.quit();
  }
  
  //using argument-enabled=false disable test
  @Test(priority=3,enabled=false)
  public void testfirefox()
  {
	  WebDriver driver=new FirefoxDriver();
	  driver.get("https://www.amazon.com");
  }
  
  
  @Test(priority=4)
  public void testIncognito() throws InterruptedException
  {
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--incognito");
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://the-internet.herokuapp.com/upload");
	  Thread.sleep(2000);
	  driver.quit();
  }
}
