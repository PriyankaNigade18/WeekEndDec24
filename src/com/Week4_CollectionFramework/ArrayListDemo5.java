package com.Week4_CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) 
	{

		//Arrays class
		
		List<Integer> l1=Arrays.asList(10,20,30);
		
		List<Integer> l2=Arrays.asList(40,50);
		
		List<List<Integer>> finalList=new ArrayList<List<Integer>>();
		finalList.add(l1);
		finalList.add(l2);
		
		System.out.println(finalList);
		
		//ArrayList class- addAll() and using constructor
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		list2.add(400);
		list2.add(500);
		list2.add(600);
		
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.addAll(list1);
		list3.addAll(list2);
		
		
		System.out.println(list3);
		
		ArrayList<Integer> list4=new ArrayList<Integer>(list1);
		list4.addAll(list2);
		System.out.println(list4);

		//Array
		System.out.println("Sorted array using Arrays.sort");
		int arr[]= {67,45,22,19,6,88,10};
		Arrays.sort(arr);
		
		for(int i:arr)
		{
			System.out.println(i);
		}
		

		System.out.println("Using Collections class sort collection");
		
		ArrayList<Integer> ll=new ArrayList<Integer>();
		ll.add(90);
		ll.add(78);
		ll.add(10);
		ll.add(39);
		ll.add(88);
		
		System.out.println(ll);
		Collections.sort(ll);
		System.out.println(ll);
		
		
		
		
		
		
		
		
		

	}

}
