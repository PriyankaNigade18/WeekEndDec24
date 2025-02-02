package com.Week4_CollectionFramework;

import java.util.LinkedList;

public class LinkedListDemo {
	/*
	 * LinkedList is class implement List interface
	 * Underline data structure is Dublylinkedlist
	 * Frequent operation is data insertion and deletion 
	 * It is order based
	 * It allows duplicate element
	 * It is based on index
	 * 
	 */
	public static void main(String[] args)
	{
		LinkedList<Integer> l1=new LinkedList<Integer>();
		System.out.println("Is list empty?: "+l1.isEmpty());
		
		if(l1.isEmpty())
		{
			l1.add(10);
			l1.add(20);
			l1.add(30);
			l1.add(40);
			l1.add(50);
			l1.add(30);
		
		
		}
		
		
		System.out.println("After adding is list empty?: "+l1.isEmpty());
		
		System.out.println("Total Eelements: "+l1.size());
		
		System.out.println(l1);
		
		l1.add(4,100);

		System.out.println(l1);
		
		//extra methods
		
		l1.addFirst(666);
		l1.addLast(777);
		
		System.out.println(l1);
		
		
		System.out.println(l1.getFirst());
		System.out.println(l1.getLast());
		
		
		System.out.println("Look for 40?: "+l1.contains(40));
		
		
		//remove
		l1.remove(4);
		System.out.println(l1);
		
	}

}
