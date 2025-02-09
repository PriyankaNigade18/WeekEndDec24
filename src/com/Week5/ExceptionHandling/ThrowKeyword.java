package com.Week5.ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) throws StringIsNullException
	{
		/*
		String s1="90AB";
		System.out.println(s1+200);//90200
		int num=Integer.parseInt(s1);
		System.out.println(num+200);//290
		*/
		
		String s1=null;
		
		if(s1==null)
		{
			throw new StringIsNullException("NullString");
		}
			

	}

}
