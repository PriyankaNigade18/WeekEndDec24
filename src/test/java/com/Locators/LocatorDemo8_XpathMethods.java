package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_XpathMethods {

	public static void main(String[] args)
	{
		//Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//maximize any browser window
		driver.manage().window().maximize();
		
		//fashion-text()
		driver.findElement(By.xpath("//a[text()='Fashion']")).click();
		
		//fashion-->women-normalize-space()
		driver.findElement(By.xpath("//span[normalize-space()='Women']")).click();

		//from women page open cart page
		driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]")).click();
		
		//to get cart text
		String cartText=driver.findElement(By.xpath("(//h3)[1]")).getText();
		System.out.println("Cart Text is: "+cartText);
		
		//search product-contains()-watch
		driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys("watch",Keys.ENTER);
		
		//clear search box and search for bags- starts-with()
		WebElement ele=driver.findElement(By.xpath("//input[starts-with(@id,'twotab')]"));
		
		ele.clear();
		ele.sendKeys("bags",Keys.ENTER);
		
		
	}

}
