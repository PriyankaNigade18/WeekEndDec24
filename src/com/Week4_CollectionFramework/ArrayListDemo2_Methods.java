package com.Week4_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo2_Methods {
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
		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Initial status that list is empty?: "+al.isEmpty());
		al.add(20);
		al.add(16);
		al.add(78);
		al.add(100);
		al.add(15);
		System.out.println("After adding elements status that list is empty?: "+al.isEmpty());
		System.out.println(al);
		
		System.out.println("Total number of elements: "+al.size());
		
		
		System.out.println("look for 50?: "+al.contains(50));//false
		System.out.println("look for 15?: "+al.contains(15));//true
		
		al.add(3,null);
		
		System.out.println(al);
		
		//remove(index)
		
		System.out.println("Remove the element at 3rd position: "+al.remove(3));
		System.out.println(al);
		
		
		//sublist
		List<Integer> list2=al.subList(0,3);
		System.out.println(list2);
		
		
		Object data[]=list2.toArray();
		
		for(Object i:data)
		{
			System.out.println(i);
		}
		
		
		//clear()
		al.clear();
		System.out.println(al);
		System.out.println(al.size());
	}

}
