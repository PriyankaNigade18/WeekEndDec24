package com.WebElementsHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultipleWindowHandling {
  @Test
  public void testMultipleWindows()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //parent /Main window
	  String parentId=driver.getWindowHandle();
	  System.out.println(parentId);
	  
	  //open link
	  driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	  
	  //child window
	  Set<String> allWindowsId=driver.getWindowHandles();
	  System.out.println(allWindowsId);
	  
	  //to child window switch
	  for(String childId:allWindowsId)
	  {
		  if(!childId.equals(parentId))//when childid and parent id are not same then same
		  {
			driver.switchTo().window(childId);
			//hrm page- enter email
			driver.findElement(By.name("EmailHomePage")).sendKeys("test@gmail.com");
			  
			//driver.close();//close active window
			//driver.quit(); close all open windows by seleniums
		  }
	  }
	  
	  //parent window
	  driver.switchTo().window(parentId);
	  
	  driver.findElement(By.name("username")).sendKeys("Priyanka");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
