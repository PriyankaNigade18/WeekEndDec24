package com.Week3;


class A
{
	public A(ThisKeywordDemo5 t)
	{
		System.out.println("A class constructor calling!");
		t.test();
	}
}
public class ThisKeywordDemo5 
{

	public void test()
	{
		System.out.println("Test is calling");
	}
	//this can be passed as argument in the constructor call.
	ThisKeywordDemo5()
	{
		A a1=new A(this);
	}
	
	
	

	public static void main(String[] args)
	{
		ThisKeywordDemo5 t1=new ThisKeywordDemo5();

	}

}
