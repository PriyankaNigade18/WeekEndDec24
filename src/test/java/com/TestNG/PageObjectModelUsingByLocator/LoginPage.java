package com.TestNG.PageObjectModelUsingByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Encapsulation= private data + public method
public class LoginPage
{
	//null
	private WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver)//we will initialize driver from the base class
	{
		this.driver=driver;
	}
	
	//locators
	private By username=By.name("username");
	private By password=By.name("password");
	private By loginButton=By.xpath("//button[@type='submit']");
	
	
	//actions
	public void setUsername(String un)
	{
		driver.findElement(username).sendKeys(un);
	}
	
	public void setPassword(String psw)
	{
		driver.findElement(password).sendKeys(psw);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}

	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(loginButton).click();
	}
	
	
}


