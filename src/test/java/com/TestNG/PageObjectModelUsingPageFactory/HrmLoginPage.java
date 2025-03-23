package com.TestNG.PageObjectModelUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Encapsulation= private data+ public method
public class HrmLoginPage 
{
	
	private WebDriver driver;
	
	//constructor
	public HrmLoginPage(WebDriver driver)//driver from base class
	{
		this.driver=driver;
		//initialize find by locators
		PageFactory.initElements(driver,this);
			
	}
	
	
	// Identify loactors
	@FindBy(name="username")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginButton;
	
	//actions
	
	public void setUsername(String un)
	{
		username.sendKeys(un);
	}
	
	
	public void setPassword(String psw)
	{
		password.sendKeys(psw);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	public void doLogin(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		loginButton.click();
	}
	

	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
}
