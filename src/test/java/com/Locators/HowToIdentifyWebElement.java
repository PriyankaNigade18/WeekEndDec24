package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToIdentifyWebElement {

	public static void main(String[] args) 
	{
		//create a driver session
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
		//technique2: Identification+action
		//driver.findElement(By.id("APjFqb")).sendKeys("Java",Keys.ENTER);
		
		//technique2: Identification+validate+action
		WebElement searchEle=driver.findElement(By.id("APjFqb"));
		
		if(searchEle.isDisplayed() && searchEle.isEnabled())
		{
			searchEle.sendKeys("Java");
		}
		
		
		
		
		//technique1: Using By Locator
		/*
		//get the search box address
		By searchBox=By.id("APjFqb");
		
		//identify address by selenium
		WebElement searchEle=driver.findElement(searchBox);
		
		//validate element
		
		System.out.println("Is searchbox visible?: "+searchEle.isDisplayed());
		System.out.println("Is searchbox Enbled?: "+searchEle.isEnabled());
		
		
		//perform actions on that element:type-sendKeys()
		searchEle.sendKeys("Cucumber",Keys.ENTER);
		
		*/
		
		
		
		
		
		
		
		
		

	}

}
