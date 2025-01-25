package com.OOP.Encapsulation;

public class BookTest {

	public static void main(String[] args)
	{

		Book b1=new Book();
		//valid scenario
//		b1.setPageno(150);
//		System.out.println("Page Number is: "+b1.getPageno());

		//invalid scenario
		b1.setPageno(-150);
		System.out.println("Page Number is: "+b1.getPageno());
	}

}
