package com.Generic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility 
{

	//explicitWait
	public static WebElement waitForPresenceOfElement(WebDriver driver,By loc)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.presenceOfElementLocated(loc));
	}
	
	public static WebElement waitForVisiblityOfElement(WebDriver driver,By loc)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.visibilityOfElementLocated(loc));
	}
	public static WebElement waitForElementToBeClickable(WebDriver driver,By loc)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.elementToBeClickable(loc));
	}
	
	public static boolean waitForUrlContains(WebDriver driver,String url)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.urlContains(url));
	}
	
	
	public static boolean waitForTitleContains(WebDriver driver,String title)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.titleContains(title));
	}
	//javascript utility
	public static void scrollDown(WebDriver driver)
	{ 
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
		
	}
	
	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	}
	
	public static void scrollUpToElement(WebDriver driver,WebElement ele)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	
	
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		Select dd=new Select(ele);
		  
		  System.out.println("Is dropdown support multiple selection?: "+dd.isMultiple());
		  
		  List<WebElement> allOptions=dd.getOptions();
		  System.out.println("Total Options are: "+allOptions.size());
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  i.click();
				  break;
			  }
		  }
	}
}
