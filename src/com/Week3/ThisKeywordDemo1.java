package com.Week3;

public class ThisKeywordDemo1 
{
	/*
	 * This keyword refers current class instance(variable+method)
	 * 1.this can be used to refer current class instance variable.

	 */
	//instance
	int price;
	String pname;
	
	public ThisKeywordDemo1(int price,String pname)//local
	{
		this.price=price;
		this.pname=pname;
		System.out.println("Paramterized constrcutor calling!");
		System.out.println("Price is: "+ this.price);//local
		System.out.println("Product name is: "+this.pname);
	}
	
	public void show()
	{
		System.out.println("show() is calling-instance data");
		System.out.println(price);//instance
		System.out.println(pname);
	}

	public static void main(String[] args) 
	{
		ThisKeywordDemo1 t1=new ThisKeywordDemo1(100,"book");
		t1.show();

	}

}
