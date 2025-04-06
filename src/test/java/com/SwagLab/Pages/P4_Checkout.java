package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P4_Checkout {

private WebDriver driver;
	
	public P4_Checkout(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//loators
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement pcode;
	
	@FindBy(id="continue")
	WebElement continueBtn;
	
	@FindBy(id="cancel")
	WebElement cancelBtn;
	
	//action
	public P5_Overview doContinue(String fn,String ln,String pc)
	{
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		pcode.sendKeys(pc);
		System.out.println("First name is: "+fn+" : lastName is: "+ln);
		continueBtn.click();
		return new P5_Overview(driver);
	}
	
	
	public P3_CartPage doCancel()
	{
		cancelBtn.click();
		return new P3_CartPage(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
