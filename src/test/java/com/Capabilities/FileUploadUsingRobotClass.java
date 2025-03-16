package com.Capabilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import java.awt.datatransfer.StringSelection;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.awt.AWTException;
import java.awt.Robot;

public class FileUploadUsingRobotClass {
  @Test
  public void testFileUpload() throws AWTException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/upload");
	  
	  //choose the file
	  WebElement ele=driver.findElement(By.id("file-upload"));
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).click().build().perform();
	  
	  //window dialog box
	  Robot rb=new Robot();
	  rb.delay(3000);
	  
	  //clip bord ctrl+c
	  StringSelection sc=new StringSelection("C:\\Users\\Ganes\\OneDrive\\Desktop\\Maven issue.txt");
	  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc,null);
	  
	 //ctrl+v press
	  rb.keyPress(KeyEvent.VK_CONTROL);
	  rb.keyPress(KeyEvent.VK_V);
	  
	  // release
	  rb.keyRelease(KeyEvent.VK_CONTROL);
	  rb.keyRelease(KeyEvent.VK_V);
	  
	  
	  //press enter key
	  rb.keyPress(KeyEvent.VK_ENTER);
	  
	  rb.delay(2000);
	  
	  //upload
	  driver.findElement(By.id("file-submit")).click();
	  
	  System.out.println("Status:"+driver.findElement(By.tagName("h3")).getText());
	  
  }
}
