package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1_LoginPage 
{
	private WebDriver driver;
	
	public P1_LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(id="user-name")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	
	//actions
	public P1_LoginPage setUsername(String un)
	{
		username.sendKeys(un);
		return this;
	}
	
	public P1_LoginPage setPassword(String psw)
	{
		password.sendKeys(psw);
		return this;
	}
	
	public P2_Inventory clickOnLoginButton()
	{
		loginButton.click();
		
		//page is navigating to inventory page
		return new P2_Inventory(driver);
	}
	
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
	return driver.getTitle();	
	}
	
	
	public P2_Inventory doLogin(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		loginButton.click();
		return new P2_Inventory(driver);
	}

}
