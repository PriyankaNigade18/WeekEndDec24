package com.Week2;

public class TypeCastingDemo {

	public static void main(String[] args)
	{
		/*
		 * Primitive to primitive
		 * 1.Implicit: automatic (JVM) small size--->large size
		 * 
		 *byte -->short-->int--->long-->float-->double
		 *
		 * 2.Explicit:manual -->casting operator
		 * large size--->small size
		 * 
		 * double-->float-->long-->int-->short-->byte
		 */
		
		int x=100;//4byte
		long l1=x; //8byte
		System.out.println("int to long conversion: "+l1);
		
		char ch='A';//2byte
		int y=ch;//4byte
		System.out.println("char to int conversion: "+y);//65
		

		long l2=9876655L;
		float f1=l2;
		System.out.println("long to float conversion: "+f1);
		
		System.out.println("**************************");
		//explicit casting
		
		long l3=999999L;
		int z=(int)l3;
		System.out.println("long to int conversion: "+z);
		
		
		int a=122;//4byte
		char c1=(char) a;//2byte
		
		System.out.println("int to char conversion: "+c1);//z
		
		
				
		float f2=90.7766F;
		int b=(int) f2;
		System.out.println("float to int conversion: "+b);
		
		
		
				
		
	}

}
