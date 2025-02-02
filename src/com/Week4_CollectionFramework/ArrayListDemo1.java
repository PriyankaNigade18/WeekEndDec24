package com.Week4_CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo1 {

	/*
	 * ArrayList is class implements List interface
	 * Underline data structure is Dynamic Array
	 * Frequent operation is data/Object retrieval
	 * ArrayList is order collection and based on indexing
	 * Duplication is allowed
	 * ArrayList default capacity is 10
	 * ArrayList is non synchronize
	 */
	public static void main(String[] args)
	{
		/*
		// non generic 1.it is not type safe 2.type casting is required
//ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		ArrayList al=new ArrayList();
		al.add(10);
		al.add("Pooja");
		al.add('F');
		al.add(78.67);
		System.out.println(al);
		
		//object to primitive
		int num=(int) al.get(0);
		System.out.println(num);
		*/
		
		//generic way 1.type safe 2. no type casting required
		
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		al.add(100);
		al.add(200);
		al.add(20);
		al.add(56);
		al.add(300);
		al.add(200);
		
		System.out.println(al);
		
		//Object to primitive
		int num=al.get(0);
		
		System.out.println(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	

}
