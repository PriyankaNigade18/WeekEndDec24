package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo7_XpathOperators_Indexing {

	public static void main(String[] args)
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
		//fname
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Komal");
		
		//lname xpath with and
		driver.findElement(By.xpath("//input[@name='lastname' and @class='form-control']")).sendKeys("sharma");
		
		//email xpath with or
		driver.findElement(By.xpath("//input[@name='email' or @class='form-contrl']")).sendKeys("komal2025@gmail.com");
		
		//telephone xpath with index
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("877655443");
		
		//password xpath with position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		//confirm password
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		//radio button-yes
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		
		//check box
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//continue button
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		//final message
		String text=driver.findElement(By.xpath("(//h1)[2]")).getText();
		
		System.out.println(text);
		
		
		
		
		
	}

}
