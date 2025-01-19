package com.Week4.Array_String;

public class StringMethods {

	public static void main(String[] args)
	{
		//length()
		String s1="Hello All";
		System.out.println("Length of string is: "+s1.length());
		
		//conversion- toLowerCase() toUpperCase()
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());

		/*
		 * equality between string
		 * 1.equals():case sensitive
		 * 2.equalsIgnoreCase():not a case sensitive
		 */
		
		String act="Selenium WebDriver is webui automation library/tool";
		String exp="Selenium WebDriver is webui automation library";
		
		System.out.println("equals(): "+act.equals(exp));//true//false
		System.out.println("equalsIgnoreCase(): "+act.equalsIgnoreCase(exp));//true//false
		
		//search-->contains()
		System.out.println("Is Selenium available in Act String?: "+act.contains("Selenium"));//true
		System.out.println("Is Webui available in act string?: "+act.contains("Webui"));//false
		
		//startsWith():prefix value      endsWith():suffix value
		System.out.println("Is Act string starts with Selenium?: "+act.startsWith("Selenium"));//true
		System.out.println("Is Act string starts with Sele?: "+act.startsWith("Sele"));//true

		System.out.println("Is Act string starts with S?: "+act.startsWith("S"));//true

		System.out.println("Is Act string starts with nium?: "+act.startsWith("nium"));//false

		
		System.out.println("Is Act string ends with library/tool?: "+act.endsWith("library/tool"));//true

		System.out.println("Is Act string ends with tool?: "+act.endsWith("tool"));//true
		
		System.out.println("Is Act string ends with library?: "+act.endsWith("library"));//false
		
		System.out.println("Is Act string ends with l?: "+act.endsWith("l"));//true

		
		//trim()- ignore white space before and after string
		
		String s2="       Welcome  All     ";	
		System.out.println(s2);
		System.out.println(s2.trim());
		
		//charAt(index): return character for that index
		System.out.println(s1.charAt(6));//A
		
		//indexOf(): returns first occurrence index of character
		
		String s3="Hello";
		System.out.println(s3.indexOf('l'));//2
		//lastIndexOf(): returns last occurrence index of character
		System.out.println(s3.lastIndexOf('l'));//3
		
		
		//concat() or +
		String s4="All";
		System.out.println(s3+" "+s4);
		System.out.println(s3.concat(" "+s4));
		
		//Returns true if the string is empty or contains only white space codepoints,otherwise false.
		//isEmpty() isBlank()
		String ss1=" ";
		System.out.println("Is string Blank?: "+ss1.isBlank());//true
		//Returns true if the string is empty or contains only white space codepoints,otherwise false.
		System.out.println("Is string empty?: "+ss1.isEmpty());//true-->false
		
		//substring()
		String ss2="TestNG is unit testing test framework";
		System.out.println(ss2.substring(9));
		
		System.out.println(ss2.substring(9,16));//15 end index-1
		
		
		//replace()
		System.out.println(ss2.replace('e','*'));
		System.out.println(ss2.replace("test","softwaretest"));
		
		//toCharArray()---String to char array

		String ss3="Software Testing";
		char arr[]=ss3.toCharArray();
		for(char i:arr)
		{
			System.out.println(i);
		}
		
		System.out.println("*******************");
		//split(regexp)
		String tools="Selenium,Appium,Postman,JMeter,UFT";
		System.out.println(tools);
		String toolList[]=tools.split(",");
		for(String i:toolList)
		{
			System.out.println(i);
		}
		//postman
		String apitool=tools.split(",")[2];
		System.out.println("Api testing tool: "+apitool);
		
		
		String date="Jan 2025";
		String month=date.split(" ")[0];
		String year=date.split(" ")[1];
		
		System.out.println("Month is: "+month);
		System.out.println("Year is: "+year);
		
		/*
		 * amount validation
		 * --------------------
		 * 1.it should be 5000 and less than 10000
		 */
		String bill="Total bill amount is 5000";
		String data=bill.split(" ")[4];
		System.out.println("String amount: "+data);
		//String to int
		int amount=Integer.parseInt(data);
		if(amount==5000 && amount<10000)
		{
			System.out.println("Amount matched...Test pass!");
		}
		else
		{
			System.out.println("Amount not matched...Test Fail!");

		}
		
		/*
		 * StringBuffer & StringBuilder class
		 * - Mutable classes
		 * - StringBuffer java 1.1 StringBuilder 1.5
		 * - StringBuffer is synchronize(one thread at a time)
		 * - StringBuildre is non synchronize(multiple thread)
		 * - The objects are create inside heap area
		 */
		
		//reverse string using method
		StringBuilder obj=new StringBuilder("Hello");
		System.out.println(obj);
		obj.append(2025);
		System.out.println(obj);
		
		//reverse()
		System.out.println(obj.reverse());
		
		System.out.println("************************");
		//reverse string using without method
		String test="Java selenium";
		String res="";
		
		for(int i=test.length()-1;i>=0;i--)
		{
			res=res+test.charAt(i);
		}
		
		System.out.println("Reverse of string is: "+res);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


		
		
		
	}

}
