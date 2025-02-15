package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LoctaorDemo4_TagName {

	public static void main(String[] args)
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/login.html");

		//Number input boxes
		List<WebElement> totalInputBoxes=driver.findElements(By.tagName("input"));
		
		System.out.println("Total elements design by input tag: "+totalInputBoxes.size());
		
		
		//number of button
		int buttons=driver.findElements(By.tagName("button")).size();
		System.out.println("Total button design by button tag: "+buttons);
		
		//Number of Links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links on Page: "+allLinks.size());
		/*
		 * get the text of link
		 * get the href of link
		 * 
		 */
		
		for(WebElement i:allLinks)
		{
			System.out.println("Text is: "+i.getText());
			System.out.println("Attribute value is:"+ i.getDomAttribute("href"));
		}
		
		
	}

}
