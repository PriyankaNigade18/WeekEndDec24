package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo9_XpathAxies {

	public static void main(String[] args)
	{
		// Create driver session
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=fhjhgh&submit-name=");
		
		//get the Grand parent node for John
		String tname=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("Ancestor node for John is: "+tname);//tbody
		
		//get the Parent of John
		String ptagname=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("Parent node for John is: "+ptagname);//tr
		
		
		//get all child of row 4
		List<WebElement> list=driver.findElements(By.xpath("//tbody//tr[4]//child::td"));
		System.out.println("Total child elements for Row 4: "+list.size());
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
		
		//get all rows after John
		int numberOfRows=driver.findElements(By.xpath("//td[text()='John']//following::tr")).size();
		System.out.println("Number of rows after John are: "+numberOfRows);
		
		//get all td tags after john
		int numberOfTd=driver.findElements(By.xpath("//td[text()='John']//following::td")).size();
		System.out.println("Number of td tags after John: "+numberOfTd);
		
		//get all rows before John
		int allRows=driver.findElements(By.xpath("//td[text()='John']//preceding::tr")).size();
		System.out.println("Number of rows before John are: "+allRows);//4
		
		//get all td tags before John
		int alltds=driver.findElements(By.xpath("//td[text()='John']//preceding::td")).size();
		System.out.println("Number of td tags before John are: "+alltds);
		
		
		//get all following siblings for John
		int fsibling=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td")).size();
		System.out.println("All following siblings for John are: "+fsibling);
		
		//get all preceding sibling for john
		int psibling=driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td")).size();
		System.out.println("All preceding sibling for john: "+psibling);
		

	}

}
