package com.OOP.Inheritance;

public class AccessModifierTest 
{
	int id=101;//default
	public String name="Kiran";
	private long phno=9887666548L;
	protected int acno=888755;
	

	public static void main(String[] args)
	{
		//same class
		AccessModifierTest a1=new AccessModifierTest();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		System.out.println(a1.acno);

	}

}
