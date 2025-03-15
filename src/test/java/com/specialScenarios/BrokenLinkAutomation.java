package com.specialScenarios;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrokenLinkAutomation {
  @Test
  public void testBrokenLink()
  {
	  /*
	   * 1.if link is with href attribute then only we can test it
2.if href is empty/null we cant test such link
3.href convert into URL request (URL class)
4.then send this request to the server
5.from the server get the status code
6.compare status 400>= then only link is broken 
	   */
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //to get all the link
	  List<WebElement> allLinks=driver.findElements(By.tagName("a"));
	  System.out.println("Total links are available on the page: "+allLinks.size());//28
	  
	  int brokenlinkcount=0;
	  for(WebElement i:allLinks)
	  {
		  String hrefValue=i.getDomAttribute("href");
		  
		  if(hrefValue==null || hrefValue.isEmpty())
		  {
			  System.out.println("Href attribute is empty/null so we cant automate it");
			  //skip the link
			  continue;
		  }
		  try {
			  //valid
			  //convert href into URL
			  URL url=new URL(hrefValue);
				
			  //send this request to server-open connection
			 HttpURLConnection conn= (HttpURLConnection) url.openConnection();
			 //connecting to server and request sent
			 conn.connect();
			  
			 //get the response code from the server
			 int statuscode=conn.getResponseCode();
			 if(statuscode>=400)
			 {
				 System.out.println(hrefValue+" =========Broken link========");
				 brokenlinkcount++;
			 }else
			 {
				 System.out.println(hrefValue+" =========valid link======");
			 }
			 
		  }catch(Exception e)
		  {
			  
		  }
			    
		  
	  }
	  
	  System.out.println("Total Broken links are: "+brokenlinkcount);//7
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
