package com.Week4_CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {
	/*
	 * TreeSet is class implement SortedSet extends Set Interface
	 * Under line data structure is Search Tree
	 * This class return sorted data
	 * duplication not allowed
	 */
	public static void main(String[] args)
	{

		TreeSet<Integer> ts=new TreeSet<Integer>();
		
		ts.add(10);
		ts.add(2);
		ts.add(8);
		ts.add(7);
		ts.add(9);
		ts.add(1);
		ts.add(11);
		ts.add(3);
		ts.add(12);
		
		System.out.println(ts);
		System.out.println("headSet():return less than elements "+ts.headSet(10));
		System.out.println("tailSet(): return greater than and equal To elements: "+ts.tailSet(10));
		System.out.println("subSet():return suset of current set: "+ts.subSet(1,9));
	
		System.out.println("Total Elements: "+ts.size());
		
		
		for(Integer i:ts)
		{
			System.out.println(i);
		}
	}

}
