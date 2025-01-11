package com.Week3;

public class ThisKeywordDemo4
{
	//this can be passed as an argument in the method call.
	//This refers current class object

	public void accept(String msg)
	{
	System.out.println(msg);
	show(this);
	}
	public void test()
	{
		System.out.println("This is test!");
	}
	public void show(ThisKeywordDemo4 t)
	{
		System.out.println("Show() calling!");
		t.test();
	}
	
	public static void main(String[] args) 
	{
		ThisKeywordDemo4 t1=new ThisKeywordDemo4();
		t1.accept("Welcome to learn this keyword!");

	}

}
