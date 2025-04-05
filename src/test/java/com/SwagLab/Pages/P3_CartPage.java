package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P3_CartPage 
{
	private WebDriver driver;
	
	public P3_CartPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	//locators
	@FindBy(xpath="//div[@class='cart_quantity']")
	WebElement cartQuantity;
	
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removeBtn;
	
	@FindBy(id="continue-shopping")
	WebElement continueBtn;
	
	@FindBy(id="checkout")
	WebElement checkoutBtn;
	
	//action
	public String getProductQuantity()
	{
		return cartQuantity.getText();
	}
	
	public P3_CartPage clickOnRemoveButton()
	{
		removeBtn.click();
		return this;
	}
	
	public P2_Inventory clickOnContinueShopping()
	{
		continueBtn.click();
		//navigate to inventory page
		
		return new P2_Inventory(driver);
	}
	

	public P4_Checkout launchCheckoutPage()
	{
		checkoutBtn.click();
		//navigating to checkout page
		return new P4_Checkout(driver);
	}
	
	
	
	
	
	
}
