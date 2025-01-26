package com.OOP.Encapsulation;

import com.OOP.Inheritance.AccessModifierTest;

public class DifferentPackage extends AccessModifierTest {

	public static void main(String[] args)
	{

		AccessModifierTest t1=new AccessModifierTest();
		System.out.println(t1.name);
		
		//protected data we can access only through child class

		DifferentPackage d1=new DifferentPackage();
		System.out.println(d1.name);
		System.out.println(d1.acno);
	}

}
