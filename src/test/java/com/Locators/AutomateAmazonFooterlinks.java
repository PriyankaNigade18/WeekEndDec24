package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAmazonFooterlinks {

	public static void main(String[] args)
	{
		// Create driver session
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		
		//footer links
		List<WebElement> list1=driver.findElements(By.xpath("//div[contains(@class,'navFooterVerticalRow')]//div//ul//li"));
		System.out.println("Total Footer links are: "+list1.size());
		
		for(WebElement i: list1)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		

	}

}
