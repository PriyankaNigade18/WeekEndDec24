package com.Week4_CollectionFramework;

import java.util.Vector;

public class VectorDemo {
	/*
	 * Vector is class implement List interface
	 * Underline data structure is Dynamic array
	 * Vector is synchronize and so performance is slow
	 * 
	 */
	public static void main(String[] args) 
	{

		Vector<Integer> v1=new Vector<Integer>();
		System.out.println("Is vector empty?: "+v1.isEmpty());
		
		if(v1.isEmpty())
		{
			v1.add(10);
			v1.add(20);
			v1.add(30);
			v1.add(40);
			v1.add(20);
			
		}
		
		System.out.println("Is veector empty after adding elements: "+v1.isEmpty());
		System.out.println("Total elements are: "+v1.size());
		
		System.out.println(v1);

	}

}
