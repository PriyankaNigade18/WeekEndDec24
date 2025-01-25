package com.OOP.Polymorphism;

public class AmazonSearchTest {

	public static void main(String[] args)
	{
		AmazonSearch obj=new AmazonSearch();
		obj.search("iphone");
		obj.search(200000);
		obj.search("watch",50000);
		obj.search("laptop","Hp");
		obj.search(10000,"zara");
		
	}

}
