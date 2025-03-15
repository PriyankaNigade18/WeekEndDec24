package com.specialScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ShadowDomElementAutomation {
  @Test
  public void testShadowDom() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //document--->shadow-host--->shadow-root--->element
	  
	  WebElement host1=driver.findElement(By.cssSelector("div#shadow_host"));
	  SearchContext root1=host1.getShadowRoot();
	  String ele1text=root1.findElement(By.cssSelector("span#shadow_content")).getText();
	  System.out.println(ele1text);
	  //Nested
	  WebElement host2=root1.findElement(By.cssSelector("div#nested_shadow_host"));
	  SearchContext root2=host2.getShadowRoot();
	  String ele2text=root2.findElement(By.cssSelector("div#nested_shadow_content")).getText();
	  System.out.println(ele2text);
	  
	  
	 //root1--->blog link 
	 WebElement link= root1.findElement(By.cssSelector("a[href='https://www.pavantestingtools.com/']"));
	  
	 Actions act=new Actions(driver);
	 act.moveToElement(link).click().build().perform();
	 
	 driver.navigate().back();
	 
	 
	 //input box
	 root1.findElement(By.cssSelector("input[type='text']")).sendKeys("Hello All");
	 
	 //checkbox
	 root1.findElement(By.cssSelector("input[type='checkbox']")).click();
	 
	 
	 //file
	 root1.findElement(By.cssSelector("input[type='file']")).sendKeys("C:\\Users\\Ganes\\OneDrive\\Desktop\\Maven issue.txt");
	 
	 
	  
	  
	  
//	  //element
//	  String eletext1=driver.findElement(By.cssSelector("span#shadow_content")).getText();
	
	  
	  
	  
	  
  }
}
