package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args)
	{

		//create  a driver session
		WebDriver driver=new ChromeDriver();
		
		//get(url): void -open application
		//InvalidArgumentException: invalid argument(url format wrong)
		//driver.get("www.google.com");
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle():String -get the title
		System.out.println("Title is: "+driver.getTitle());
		
		//getCurrentUrl(): String- get the current url
		System.out.println("Current url : "+driver.getCurrentUrl());
		
		
		//getPageSource():String -get the page source
		System.out.println(driver.getPageSource());
		
		//close()/quit(): close browser
		
		//driver.close();
		driver.quit();
		
		

	}

}
