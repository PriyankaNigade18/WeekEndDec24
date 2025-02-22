package com.WebElementsHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class FacebookDropdown_SelectBased
{
	
	
	
	
  @Test
  public void testDropDown() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.facebook.com/");
	  
	  //Create new account link
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  //day
	  WebElement dayele=driver.findElement(By.id("day"));
	  Utility.selectBasedDropdown(dayele,"27");
	  
	  //month
	  WebElement monthele=driver.findElement(By.id("month"));
	  Utility.selectBasedDropdown(monthele,"Dec");
	  
	  //year
	  
	  WebElement yearele=driver.findElement(By.id("year"));
	  Utility.selectBasedDropdown(yearele,"2010");
	  
	  
	  
	  /*
	  //day dropdown
	  WebElement dayele=driver.findElement(By.id("day"));
	  
	  Select dd=new Select(dayele);
	  
	  System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
	  
	  List<WebElement> allOptions=dd.getOptions();
	  System.out.println("Total Options are: "+allOptions.size());
	  
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("27"))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  /*
	  //month dropdown
	  WebElement monthele=driver.findElement(By.id("month"));
	  
	  Select monthdd=new Select(monthele);
	  
	  System.out.println("Is dropdown support multiple selection?: "+monthdd.isMultiple());
	  
	  List<WebElement> monthOptions=monthdd.getOptions();
	  System.out.println("Total months are: "+monthOptions.size());
	  
	  for(WebElement i:monthOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Dec"))
		  {
			  i.click();
			  break;
		  }
	  }
	 */
	  
	  
	  
	  
	  
  }
}
