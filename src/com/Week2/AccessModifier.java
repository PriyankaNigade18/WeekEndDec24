package com.Week2;

public class AccessModifier {

	//instance
	int id=101;//default
	public String name="Sarang";
	private int phno=98655433;
	
	
	public static void main(String[] args)
	{
		System.out.println("Calling from same class");
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);
		System.out.println(a1.name);
		System.out.println(a1.phno);
		

	}

}
