package com.TestNG.ListenersTest;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import com.aventstack.chaintest.plugins.ChainTestListener;

@Listeners(ChainTestListener.class)
public class Baseclass {

	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://automationplayground.com/crm/");
	}
	
	@AfterClass
	  public void tearDown()
	  {
		  driver.quit();
	  }
	
	//add screenshot in report for every failure
	@AfterMethod
	public void addScrennshot(ITestResult result)
	{
		if(!result.isSuccess())
		{
			ChainTestListener.embed(getScreenshot(),"image/png");
		}
	}
	
	public byte[] getScreenshot()
	{
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
}
