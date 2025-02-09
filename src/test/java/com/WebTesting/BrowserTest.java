package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) 
	{
		// create a driver session
		
		WebDriver driver=new ChromeDriver();
		
		WebDriver driver2=new FirefoxDriver();
		
		WebDriver driver3=new EdgeDriver();
		

	}

}
