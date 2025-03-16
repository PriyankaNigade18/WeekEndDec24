package com.Capabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadUsingSendKeys {
  @Test
  public void testFileUpload() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //choose the file
	  driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\Ganes\\OneDrive\\Desktop\\Maven issue.txt");
	  
	  //upload
	  driver.findElement(By.id("file-submit")).click();
	  
	  System.out.println("Status:"+driver.findElement(By.tagName("h3")).getText());
	  
	  
	  
  }
  
}
