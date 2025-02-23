package com.WebElementsHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DissappearDropdown_Orangehrm {
  @Test
  public void testDropdown()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //username
	  
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  
	  //password
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  	  
	  //login
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  
	  //pim
	  
	  driver.findElement(By.xpath("//span[text()='PIM']")).click();
	  
	  //job title dropdown
	  driver.findElement(By.xpath("(//i[contains(@class,'oxd-select-text--arrow')])[3]")).click();
	  
	  //list
	  List<WebElement> allOptions=driver.findElements(By.xpath("//div//div[@class='oxd-select-option']//span"));
	  
	  System.out.println("Total options are: "+allOptions.size());
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("QA Engineer"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
