package com.OOP.Polymorphism;

public class AmazonSearch
{

	public void search(String pname)
	{
		System.out.println("Product searched by name: "+pname);
	}
	
	
	public void search(int price)
	{
		System.out.println("Product searched by price: "+price);
	}
	
	public void search(String pname,String bname)
	{
		System.out.println("Product searched by name: "+pname+" & searched with brand: "+bname);
	}
	
	public void search(String pname,int price)
	{
		System.out.println("Product searched by name: "+pname+" & searched with price: "+price);
	}
	
	public void search(int price,String bname)
	{
		System.out.println("Product searched price: "+price+" & searched with brand name: "+bname);
	}
	
}
