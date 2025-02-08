package com.Week4_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HowToRemoveDuplicateElementsFromList {

	public static void main(String[] args) 
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		
		al.add(10);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(20);
		al.add(20);
		al.add(40);
		
		System.out.println(al);
		
		
		/*
		 * 1.Convert list into Set
		 * 	-sort()
		 * 2.Pass list into TreeSet class
		 * 
		 */
		
		HashSet<Integer> hs=new HashSet<Integer>(al);
		System.out.println(hs);
		
		
		//for sorted result
		TreeSet<Integer> ts=new TreeSet<Integer>(al);
		System.out.println(ts);
		
		
		/*
		 * To remove duplicate elements and maintain order of insertion
		 * 
		 * LinkedHashSet [List+Set]
		 * - it maintains order
		 * - It store unique store
		 * 
		 * 
		 */
		
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>(al);
		System.out.println(ls);
		
		
		
		
		
		
		
		
	}

}
