package com.Week4_CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	/*
	 * HashSet is class implement Set interface
	 * underline data structure for Hashset is HashTable
	 * HashTable maintains data based on Hashing mechanism
	 * It calculate hashcode and key for the element and based on index it maintain
	 * data inside table
	 * HashSet is not order collection
	 * HashSet doesn't allow duplication
	 * internally it creates 16 locations and ,maintain linkedlist
	 * |Key|hashcode|value|address of next element|
	 * null values allowed
	 * hashcode and index for null value is 0
	 * 
	 */
	public static void main(String[] args)
	{
		
		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println("Is Set empty?: "+hs.isEmpty());
		
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(40);
		hs.add(40);
		hs.add(null);
		System.out.println("After Adding elements Is Set empty?: "+hs.isEmpty());
		System.out.println(hs);
		System.out.println("Total Elements: "+hs.size());
		System.out.println("Look for null: "+hs.contains(null));
		hs.remove(null);
		System.out.println(hs);
		System.out.println("*******Iteration using for each loop**********");
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
		System.out.println("*******Iteration using iterator()**********");
		Iterator<Integer> ir=hs.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		


	}

}
