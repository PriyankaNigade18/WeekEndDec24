package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstBrowserTest {

	public static void main(String[] args)
	{
		//Create a driver session
		WebDriver driver=new ChromeDriver();
		
		//to open any application : get(url):void

		driver.get("https://www.google.com");
		
		//to get the title: getTitle(): String
		String actTitle=driver.getTitle();
		System.out.println("Title is: "+actTitle);
		
		//validate title 
		String expTitle="Google";
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Title matched.....Test Pass!");
			
		}
		else
		{
			System.out.println("Title not matched....Test Fail!");
		}
		
		
		
		

	}

}
