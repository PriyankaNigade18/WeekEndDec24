package com.WebElementsHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarAutomation_Redbus {
  @Test
  public void testCalendar() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  
	  //open calendar
	  driver.findElement(By.xpath("//span[@class='dateText']")).click();
	  
	  //expection
	  String day="6";
	  String emonth="Dec";
	  String eyear="2025";
	  
	  //month selection
	  while(true) 
	  {
	  //get the current month
	  String currentMonth=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[3]")).getText();
	  System.out.println(currentMonth);
	  String cmonth=currentMonth.split(" ")[0];
	  
	  String cyear=currentMonth.split(" ")[1];
	  
	  System.out.println(cmonth+" : "+cyear);
	  
	  if(cmonth.contains(emonth) && cyear.contains(eyear))
	  {
		  System.out.println("Month selected");
		  break;
	  }
	  else
	  {
		  //click on arrow for next month

		  driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator')])[4]")).click();
	  }
	  
	  }
	  
	  //date selection
	  List<WebElement> allDates=driver.findElements(By.xpath("//div//span[contains(@class,'DayTiles__CalendarDaysSpan')]"));
	  
	  for(WebElement i:allDates)
	  {
		  if(i.getText().contains(day))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
  }
}
