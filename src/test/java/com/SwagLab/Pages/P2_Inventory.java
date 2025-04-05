package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_Inventory
{
	private WebDriver driver;
	
	public P2_Inventory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	@FindBy(xpath="//div//div[@class='inventory_item_name ']")
	List<WebElement> allProduct;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addTocartButton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartOption;
	
		//actions
	public int getProductCount() 
	{
		return allProduct.size();
	}
	
	public P2_Inventory getAllProductNames()
	{
		System.out.println("Product Name Details...");
		for(WebElement i:allProduct)
		{
			System.out.println(i.getText());
		}
		return this;
	}
	
	
	public void addProductToCart(String pname)
	{
		
		for(WebElement i:allProduct)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		
		//click on addtocart button
		addTocartButton.click();
		System.out.println("Product added to cart: "+pname);
	}

	public P3_CartPage launchCartPage()
	{
		cartOption.click();
		return new P3_CartPage(driver);
	}
}
