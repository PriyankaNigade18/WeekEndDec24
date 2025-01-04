package com.Week2;

public class WrapperClassDemo {

	public static void main(String[] args) 
	{
		/*
		 * Wrapper class helps to use primitive data as Object
		 * 
		 */
		
		//primitive(int) to Object(Integer) conversion-valueOf()
		
		int x=100;
	Integer obj1=Integer.valueOf(x);
	System.out.println(obj1);//100
		
	float f1=89.67F;
	Float fobject=Float.valueOf(f1);
	System.out.println(fobject);
	
	char ch='P';
	Character c=Character.valueOf(ch);
	System.out.println(c);
	
	//Object(Integer) ---->primitive (int) --> intValue()
	
	Integer i1=976544;
	int num1=i1.intValue();
	System.out.println(num1);
	
	Double dobject=67.7878987767;
	double dnum=dobject.doubleValue();
	System.out.println(dnum);
	
	Character c1='K';
	char c2=c1.charValue();
	System.out.println(c2);
	System.out.println("******************************");
	
	//String to primitive 
	//NumberFormatException - if the string does not contain aparsable integer.
	//String s1="amount is 100";
	String s1="100";
	System.out.println(s1+100);//amount is 100100
	int num=Integer.parseInt(s1);//NumberFormatException
	System.out.println(num+100);//200
	
	//string --->double
	String s2="89.67";
	System.out.println(s2+11.11);//89.6711.11
	double num2=Double.parseDouble(s2);
	System.out.println(num2+11.11);//100.78
	
	//String ---->char-charAt()
	
	String s3="U";
	//String is collection of characters
	char c4=s3.charAt(0);
	System.out.println(c4);
	
	//primitive to String-valueOf()
	
	int a1=90;
	System.out.println(a1+100);//190
	String ss1=String.valueOf(a1);
	System.out.println(ss1+100);//90100
	
	
	
	
	
	
	/*
	 * scenario: 
	 * bill amount is 5000
	 * wanted to confirm that bill amount should be less than 10000 only
	 */
	
	String msg="Total bill amount is 5000";
	String data=msg.split(" ")[4];
	System.out.println(data);
	//string to number
	int amount=Integer.parseInt(data);
	System.out.println(amount);//5000
	
	if(amount<10000)
	{
		System.out.println("Amount is correct....Test pass!");
	}else
	{
		System.out.println("Amount is incorrect....Test Fail!");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
