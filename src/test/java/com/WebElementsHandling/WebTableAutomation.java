package com.WebElementsHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableAutomation {
  @Test
  public void testStaticTable() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //Number of rows
	  int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
	  System.out.println("Number of rows are: "+rows);//7
	  
	  //Number of columns
	 List<WebElement> headings=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[1]//th"));
	  System.out.println("Number of columns are: "+headings.size());//4
	  
	  System.out.println("All Headings in table:");
	  
	  //Print all headings
	  for(WebElement i:headings)
	  {
		  System.out.println(i.getText());
	  }
	  System.out.println("**************Specific Row***********");
	  //specific row data
	  WebElement row=driver.findElement(By.xpath("//table[@name='BookTable']//tbody//tr[5]"));
	  System.out.println(row.getText());
	  
	  System.out.println("**************Specific Cell***********");

	  //specific column data
	  List<WebElement> cellsdata=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[2]"));
	  for(WebElement i:cellsdata)
	  {
		  System.out.println(i.getText());
	  }
	  
	  //get every book price and calculate total price-Assignment
	  
	  
	  //all the table data
	  List<WebElement> allData=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td"));
	  System.out.println("total data is: "+allData.size());
	  
	  for(WebElement i:allData)
	  {
		  System.out.println(i.getText()+" ");
	  }
	  
	  
  }
  
  @Test
  public void testDynamicTable() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  //Number of Rows
	  int rows=driver.findElements(By.xpath("//table[@id='taskTable']//tr")).size();
	  System.out.println("Number of rows are: "+rows);//5
	  
	  //Number of columns
	  List<WebElement> headings=driver.findElements(By.xpath("//table[@id='taskTable']//tr[1]//th"));
	  System.out.println("Number of columns are: "+headings.size());//5
	  
	  //number of Headings
	  System.out.println("**********All Headings*********");
	  
	  for(WebElement i:headings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  System.out.println("******Specific row*********");
	  /*
	   * get the count for chrome row then add count into xpath then iterate
	   */
	  int count=0;
	  for(WebElement i:headings)
	  {
		  count++;
		  //compare column=Name
		  if(i.getText().contains("Name"))
		  {
			  int position=count;
			  System.out.println("position for Column Name: "+position);
			  
			  List<WebElement> celldata=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td["+count+"]"));
			  
			  int rowcount=0;
			  for(WebElement j:celldata)
			  {
				  rowcount++;
				  //to get the chrome data
				  if(j.getText().contains("Chrome"))
				  {
					  int pos=rowcount;
					  System.out.println("row count for chrome is: "+pos);
					  List<WebElement> alldata=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr["+pos+"]//td"));
					  for(WebElement k:alldata)
					  {
						  System.out.println(k.getText());
					  }
				  }
			  }
			  
		  }
		  
	  }
		  System.out.println("********Specific columns*********");
		  int cellcount=0;
		  //memory
		  for(WebElement h:headings)
		  {
			  cellcount++;
			  if(h.getText().contains("Memory (MB)"))
			  {
				  //get the column count
				  System.out.println("Position of Memory column is: "+cellcount);
				  List<WebElement> celldata=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td["+cellcount+"]"));
				  
				  for(WebElement c:celldata)
				  {
					  System.out.println(c.getText());
				  }
			  }
		  }
		  
		  
		  
		  
		  
		  
	  
	  
  }
  
  
  
  @Test
  public void testPeginationTable() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  
	  List<WebElement> pages=driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
	  System.out.println("Total pages are: "+pages.size());
	  
	  for(WebElement i:pages)
	  {
		  i.click();//open page
		  System.out.println("Page Number: "+i.getText());
		  //Number of Rows
		  System.out.println("Number of rows: "+driver.findElements(By.xpath("//table[@id='productTable']//tr")).size());
		  //Number of columns
		  System.out.println("Number of columns are: "+driver.findElements(By.xpath("//table[@id='productTable']//tr[1]//th")).size());
	  }
	  
	  
	  System.out.println("**********************");
	  //page number 3 -->check name=Fitness Tracker and click on checkbox
	  
	  for(WebElement i:pages)
	  {
		  if(i.getText().contains("3"))
		  {
			  i.click();
			  
			  List<WebElement> celldata=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td[2]"));
			 int rcount=0;
			  for(WebElement j:celldata)
			  {
				  rcount++;
				  if(j.getText().contains("Fitness Tracker"))
				  {
					  System.out.println("Match found...at position: "+rcount);
					  driver.findElement(By.xpath("//table[@id='productTable']//tbody//tr["+rcount+"]//td[4]//input")).click();
					  break;
				  }
			  }
		  }
	  }
	  
	  
	  
	  
	  
  }
}
