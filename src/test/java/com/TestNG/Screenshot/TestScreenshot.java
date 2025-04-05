package com.TestNG.Screenshot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TestScreenshot {
  @Test
  public void testScreenshot() throws IOException 
  {
	  Date dt=new Date();
	  SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
	  String currentdate=sdf.format(dt);
	  System.out.println(currentdate);
	  
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  TakesScreenshot ts=(TakesScreenshot) driver;
	 File temp= ts.getScreenshotAs(OutputType.FILE);
	 File dest=new File(System.getProperty("user.dir")+"//Screenshots//Amazon"+currentdate+System.currentTimeMillis()+".png"); 
	 
	 FileHandler.copy(temp,dest);
	 
	 
	 
	 
	 
	 
	  
	  
	  
  }
}
