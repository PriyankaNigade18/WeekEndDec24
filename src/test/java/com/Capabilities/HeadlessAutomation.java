package com.Capabilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessAutomation {
  @Test
  public void testHeadless()
  {
	  		ChromeOptions options=new ChromeOptions();
	  		options.addArguments("--headless");
	    
	  		// create driver session
			WebDriver driver=new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			System.out.println("Driver session created......");
			driver.get("https://www.google.com/");
			System.out.println("Application launch......");

			//searchbox
			driver.findElement(By.id("APjFqb")).sendKeys("Cucumber");
			System.out.println("Search for Cucumber keyword......");

			System.out.println("List of Options......");
			//list of options
			List<WebElement> list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
			System.out.println("Total Options are: "+list.size());
			
			for(WebElement i:list)
			{
				System.out.println(i.getText());
			}
			
			//close
			driver.quit();
			
			System.out.println("driver session closed!");
			
  }
}
