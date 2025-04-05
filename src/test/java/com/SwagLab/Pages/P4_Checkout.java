package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class P4_Checkout {

private WebDriver driver;
	
	public P4_Checkout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

}
