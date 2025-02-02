package com.Week4_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {

	/*
	 * Collection is interface
	 * Collections is class which have static methods
	 */
	public static void main(String[] args)
	{

		List<Integer> al=new ArrayList<Integer>();
		al.add(90);
		al.add(10);
		al.add(56);
		al.add(20);
		al.add(55);
		
		System.out.println(al);
		
		System.out.println("Max element: "+Collections.max(al));
		
		System.out.println("min Element: "+Collections.min(al));
		
		System.out.println(al);
		
		List<Integer> l1=new ArrayList<Integer>();
		l1.addAll(al);
		l1.add(67);
		l1.add(99);
		
		
		System.out.println(l1);
		
		//sort
		Collections.sort(l1);
		System.out.println(l1);
		
//		List<Integer> l2=new ArrayList<Integer>();
//		l1.add(100);
//		l1.add(200);
//		
//		List<Integer> l3=new ArrayList<Integer>(2);
//		
//		Collections.copy(l3,l2);
//		
//		System.out.println(l3);

	}

}
