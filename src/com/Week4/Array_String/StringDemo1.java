package com.Week4.Array_String;

public class StringDemo1 {

	/*
	 * String is implemented as class in java
	 * String is collection of characters
	 * String is immutable class
	 * Ways
	 * ==========
	 * 1.using literal : object will create inside SCP(String constant pool)
	 * 2.Using new keyword: Object will create inside Heap and scp
	 */
	public static void main(String[] args)
	{

		String s1="ABCD";
		String s2="ABCD";
		/*
		 * == compares Object Id's
		 * Methods() compares data
		 */
		System.out.println(s1==s2);//true
		
		String s3=new String("ABCD");
		System.out.println(s1==s3);//false
		
		
		//String is immutable class
		String ss1="Hello";
		String ss2="Hello";
		
		System.out.println(ss1==ss2);//true
		
		ss1=ss1+"All";
		
		System.out.println(ss1==ss2);//false

		
		
		
		

	}

}
