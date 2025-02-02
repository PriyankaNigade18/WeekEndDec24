package com.Week4_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo3_Iteration {

	/*
	 * ArrayList is class implements List interface
	 * Underline data structure is Dynamic Array
	 * Frequent operation is data/Object retrieval
	 * ArrayList is order collection and based on indexing
	 * Duplication is allowed
	 * ArrayList default capacity is 10
	 * ArrayList is non synchronize
	 * 
	 * Iteration
	 * ===============
	 * 1.Using simple For loop
	 * 2.Using for each loop
	 * 3.using iterator()
	 */
	public static void main(String[] args) 
	{

		List<Integer> l1=new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		System.out.println("*********Iteration using for loop***********");
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		System.out.println("*********Iteration using for each loop***********");
		
		for(Integer i:l1)
		{
			System.out.println(i);
		}
		
		System.out.println("*********Iteration using iterator()***********");

		/*
		 * iterator() returns Iterator interface object
		 * Iterator Interface has two method
		 * 1.hasNext():true if the iteration has more elements
		 * 2.next():Returns the next element in the iteration.
		 */
		
		
			Iterator<Integer> ir=l1.iterator();
			while(ir.hasNext())
			{
				System.out.println(ir.next());
			}
		
		
		
		
		
		
		
		

	}

}
