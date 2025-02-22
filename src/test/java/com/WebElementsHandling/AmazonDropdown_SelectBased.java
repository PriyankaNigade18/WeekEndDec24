package com.WebElementsHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class AmazonDropdown_SelectBased 
{
  @Test
  public void testDropDown() throws InterruptedException 
  {
	  //create driver session
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  //get the address of dropdown
	  WebElement dropdownele=driver.findElement(By.id("searchDropdownBox"));
	  
	  Utility.selectBasedDropdown(dropdownele,"Toys & Games");
	  /*
	  //create object of Select class
	  Select dd=new Select(dropdownele);
	  
	  System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
	  
	  //single option selection
	  dd.selectByVisibleText("Gift Cards");
	  
	  Thread.sleep(2000);
	  
	  dd.selectByIndex(3);//Amazon Fashion
	  
	  Thread.sleep(2000);
	  
	  dd.selectByValue("search-alias=software");
	  
	  //calculate total options and get all options into console
	  
	  List<WebElement> allOptions=dd.getOptions();
	  System.out.println("Total options are: "+allOptions.size());
	  
	  for(WebElement i: allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Video Games"))
		  {
			  System.out.println("Match found....Test Pass!");
			  i.click();
			  break;
		  }
	  }
	  
	  
	  */
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
