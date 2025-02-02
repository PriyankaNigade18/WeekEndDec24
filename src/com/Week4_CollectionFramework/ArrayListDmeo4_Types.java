package com.Week4_CollectionFramework;

import java.util.ArrayList;

public class ArrayListDmeo4_Types {

	public static void main(String[] args)
	{ 
		ArrayList<Integer> id=new ArrayList<Integer>();
		id.add(101);
		id.add(102);
		id.add(103);
		
		System.out.println("Total Id's are: "+id.size());
		
		for(Integer i:id)
		{
			System.out.println(i);
		}
		
		System.out.println("**************************");
		
		
		ArrayList<String> loc=new ArrayList<String>();
		loc.add("Pune");
		loc.add("Mumbai");
		loc.add("Nashik");
		
		System.out.println("Total locatotions are: "+loc.size());
		
		for(String i:loc)
		{
			System.out.println(i);
		}
		
		System.out.println("**************************");

		
		
		ArrayList<Object> data=new ArrayList<Object>();
		data.add("Sarang");
		data.add("Pune");
		data.add('M');
		data.add(30);
		data.add(88776655L);
		
		System.out.println(data);
		
		
		
		
		
		
		
	}

}
