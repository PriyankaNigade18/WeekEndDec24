package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P5_Overview {

private WebDriver driver;
	
	public P5_Overview(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//locators
	@FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement itemName;
	
	@FindBy(xpath="//div[@class='summary_info_label']")
	List<WebElement> lables;//3
	
	@FindBy(xpath="//div[@class='summary_value_label']")
	List<WebElement> values;//2
	
	@FindBy(xpath="//div[@class='summary_total_label']")
	WebElement total;
	
	@FindBy(id="finish")
	WebElement finishBtn;
	
	@FindBy(tagName="h2")
	WebElement message;
	
	
	
	//actions
	public String getProductDetail()
	{
		return itemName.getText();
	}
	
	public P5_Overview getPaymentInfomartion()
	{
		System.out.println(lables.get(0).getText());
		System.out.println(values.get(0).getText());
		return this;
	}
	
	public P5_Overview getShippingInformation()
	{
		System.out.println(lables.get(1).getText());
		System.out.println(values.get(1).getText());
		return this;
	}
	
	public P5_Overview getPriceDetails()
	{
		System.out.println(lables.get(2).getText());
		System.out.println(total.getText());
		return this;
		
	}
	
	
	public String doFinish()
	{
		finishBtn.click();
		return message.getText();
	}
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
}
