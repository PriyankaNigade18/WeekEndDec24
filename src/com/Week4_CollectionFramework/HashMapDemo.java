package com.Week4_CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	/*
	 * HahsMap is class implement Map interface
	 * Underline data structure is HashTable
	 * Initially it maintains 16 locations
	 * Map hold <Key ,value>
	 * Entry is interface in Map
	 * Key are always unique
	 * Values duplication allowed
	 */
	public static void main(String[] args)
	{
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		hm.put("VimanNagar",411014);
		hm.put("Lohegaon",411047);
		hm.put("Wadgaosheri",411014);
		hm.put("Kharadi",411048);
		hm.put("Kharadi",411044);
		
		
		
		System.out.println(hm);
		System.out.println("Total areas are: "+hm.size());
		
		System.out.println("look for key Kharadi?: "+hm.containsKey("Kharadi"));
		System.out.println("look for Value 411044?: "+hm.containsValue(411044));
		
		/*
		 * How to iterate map
		 * - using for each loop
		 * - using iterator():convert Map into Collection
		 * 
		 */
		
		for(Map.Entry<String,Integer> i:hm.entrySet())
		{
//			System.out.println("Key is: "+i.getKey());
//			System.out.println("Value is: "+i.getValue());
			//System.out.println(i);
			System.out.println(i.getKey()+" : "+i.getValue());
			
		}
		
		System.out.println("****************************");
		//map--->set
		Set<Entry<String,Integer>> set=hm.entrySet();
		Iterator<Entry<String,Integer>> ir=set.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
