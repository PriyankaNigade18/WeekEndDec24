package com.OOP.Inheritance;


//final class Demo
class Demo
{
	final float pi=3.14f;
	
	public final void areaOfCircle()
	{
		System.out.println("Area is: "+pi*5*5);
	}
}
//The type FinalKeywordDemo cannot subclass the final class Demo
public class FinalKeywordDemo extends Demo
{
//	@Override//Cannot override the final method from Demo
//	public void areaOfCircle()
//	{
//		int r=10;
//		System.out.println("Child class Area of circle is: "+pi*r*r);
//	}
	
	public static void main(String[] args)
	{
		FinalKeywordDemo f1=new FinalKeywordDemo();
		
		System.out.println(f1.pi);
		//f1.pi=3.22f;
		
		System.out.println(f1.pi);
		
		f1.areaOfCircle();

		
		
				


	}

}
