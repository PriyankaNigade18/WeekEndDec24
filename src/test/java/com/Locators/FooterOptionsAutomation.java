package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterOptionsAutomation {

	public static void main(String[] args) 
	{
		

		//create driver session
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.freshworks.com/");
		
		
		List<WebElement> allFooters=driver.findElements(By.xpath("//nav[@class='sc-662dedcb-0 fMAcTI']//div//ul//li"));
		System.out.println("Total Footer links are: "+allFooters.size());
		
		for(WebElement i:allFooters)
		{
			System.out.println(i.getText());
		}
	}

}
