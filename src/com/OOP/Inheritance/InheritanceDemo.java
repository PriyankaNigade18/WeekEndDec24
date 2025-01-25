package com.OOP.Inheritance;


class A
{
	public void m1()
	{
		System.out.println("M1 is calling!");
	}
}


class B extends A//A is parent and B is child-Single Level inheritance
{
	public void m2()
	{
		System.out.println("M2 is calling!");
	}
}

class C extends B// B is parent and C is child, A is gp= Multilevel
{
	public void m3()
	{
		System.out.println("M3 is calling!");
	}
}

class D extends A//A is parent and D is child: Hierarchical Inheritance
{
	public void m4()
	{
		System.out.println("M4 is calling!");
	}
}
public class InheritanceDemo {

	public static void main(String[] args)
	{
		System.out.println("Scenario1: Child class ref and child class Object:Parent+child");
		
		//single level inheritance A<----B
//		B b1=new B();
//		b1.m1();//inherited
//		b1.m2();//individual
		
		//Multilevel Inheritance A<----B<----C
		
//		C c1=new C();
//		c1.m1();//inherited
//		c1.m2();//inherited
//		c1.m3();//individual
		
		//Hierarchical Inheritance A<<--B,D
		D d1=new D();
		d1.m1();//inherited
		d1.m4();//individual
		
		
		
		System.out.println("Scenario2: Parent class ref and Parent class Object:Parent");
		//single level inheritance A<----B
		
//		A a1=new A();
//		a1.m1();//individual
		
		//Multilevel Inheritance A<----B<----C
//		B b1=new B();
//		b1.m1();//inherited
//		b1.m2();///Individual
		
		//Hierarchical Inheritance A<<--B,D
		A a1=new A();
		a1.m1();//individual
		
		System.out.println("Scenario3: Parent class ref and child class Object:Parent");
		//single level inheritance A<----B
//		A a2=new B();
//		a2.m1();
	
		//Multilevel Inheritance A<----B<----C
//		B b2=new C();
//		b2.m1();//inherited
//		b2.m2();//Individual
		
		//Hierarchical Inheritance A<<--B,D
		
		A a2=new D();
		a2.m1();//individual
		
		System.out.println("Scenario4:  child class ref and parent class Object:Invalid");

		//java support top casting
		//B b2=new A();//Type mismatch: cannot convert from A to B
		
	}

}
