package com.Week3;

public class ThisKeywordDemo2 
{
	
	//this can be used to invoke current class method (implicitly)

	public void m1()
	{
		System.out.println("m1() is calling");
		m2();
		this.m2();
	}

	public void m2()
	{
		System.out.println("m2() is calling");
		this.m3();
	}
	public void m3()
	{
		System.out.println("m3() is calling");
	}
	public static void main(String[] args) 
	{
		ThisKeywordDemo2 t1=new ThisKeywordDemo2();
		t1.m1();

	}

}
