package com.Week4_CollectionFramework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	/*
	 * LinkedHashSet is class implements Set interface
	 * Is based on LinkedList and HashSet
	 * - It is order collection
	 * - duplication not allowed
	 */
	public static void main(String[] args)
	{
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(30);
		ls.add(20);
		
		System.out.println(ls);
		System.out.println("Total Elements: "+ls.size());
		
		System.out.println("look for 30?: "+ls.contains(30));

		ls.remove(30);
		
		System.out.println(ls);
		
		
		/*
		 * Scenario: Remove duplicate characters from string
		 * String s1="aabbccddeeffgg";
		 * 
		 */
		
		String s1="aabbccddeeffgg";
		System.out.println("String is: "+s1);
		
		LinkedHashSet<Character> li=new LinkedHashSet<Character>();
		String res="";
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			li.add(ch);
			//res=res+ch;
		
		}
		
		
		System.out.println(li);
		
		//just print result in string format
		for(Character c:li)
		{
			res=res+c;
		}
		
		System.out.println(res);
		
		
		
		
					
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
