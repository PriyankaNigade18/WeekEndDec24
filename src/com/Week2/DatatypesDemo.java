package com.Week2;

public class DatatypesDemo {

	public static void main(String[] args)
	{
		// primitive
		//boolean 1 bit true/false
		boolean status=true;
		System.out.println("boolean data is: "+status);
		status=false;
		System.out.println("updated boolean data is: "+status);

		boolean newstatus=true;
		System.out.println("boolean new data is: "+newstatus);
		
		System.out.println("****************************");
		//numeric-->character
		/*
		 * char size: 2byte 
		 * ---------------------
		 * 1.single character
		 * 2.special character
		 * 3.ASCII values of characters
		 * 
		 * A -Z =65 to 90
		 * a- z= 97 to 122
		 * 0 to 9= 48 to 57
		 */
		
		char c1='A';
		char c2='$';
		System.out.println("Character data is: "+c1);
		System.out.println("Character data is: "+c2);
		char ch=97;//it is accepting ascii value for charcater and return charcater for that value
		System.out.println("Charcater for ascii 97 is: "+ch);//a
		
		System.out.println("*********************************");
		//Numeric--->Integral--->1.Integer 2.floating point
		//byte --->short---> int(default) --->long
		//byte 1byte -128 to 127
		
		byte b1=127;
		byte b2=120;
		byte b3=-128;
		byte b4=-125;
		//Type mismatch: cannot convert from int to byte
		//byte b5=130;
		
		System.out.println("byte data is: "+b1);
		
		System.out.println("byte data is: "+b2);
		System.out.println("byte data is: "+b3);
		System.out.println("byte data is: "+b4);
		
		
		//short 2byte -32768 to 32767
		
		short s1=130;
		short s2=32767;
		short s3=-32768;

		//Type mismatch: cannot convert from int to short
		//short s4=50000;
		
		System.out.println("Short data is: "+s1);
		System.out.println("Short data is: "+s2);
		System.out.println("Short data is: "+s3);
		
		//int 4byte 
		
		int i1=9000000;
		System.out.println("Integer data is: "+i1);
		//The literal 9999999999 of type int is out of range 
		//int i2=9999999999;
		
		//long 8byte  suffix L/l
		
		long l1=9999999999L;
		System.out.println("long type data is: "+l1);
		
		//integral --->floating point 
		/*
		 * float  4byte    double 8 byte (default)
		 * 
		 * 
		 */
		
		
		double d1=98.77665443;
		System.out.println("double data is: "+d1);
		
		float f1=67.55433F;
		System.out.println("float data is: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
