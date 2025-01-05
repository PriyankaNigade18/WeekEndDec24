package com.Week2;

public class CompiletimeParameterPassing
{
	
	public void add()//0 parameter
	{
		int a=10,b=20;
		System.out.println("Addition is: "+(a+b));
	}
	//function defination
	public void sub(int a,int b)//2 parameters a=100 and b=30 area local parameters
	{
		System.out.println("Subtraction is: "+(a-b));
	}
	

	public void mul(int a,int b)//2 parameters
	{
		System.out.println("multiplication is: "+(a*b));
	}

	
	public int div(int a,int b)//a=100,b=10
	{
		int c=a/b;
		return c;
	}
	
	public String info()
	{
		String msg="Hello Everyone!";
		return msg;
		
	}
	
	public static void main(String[] args)
	{
		//calling function
		CompiletimeParameterPassing c=new CompiletimeParameterPassing();
		c.add();
		/*
		 * when we pass real data that is called argument
		 * when we pass variables that is called parameters in java
		 * 
		 * When we pass argument to the method while calling that method 
		 * is called compile time parameter passing
		 */
		c.sub(100,30);
		
		c.mul(90,60);
		
		/*
		 * return Keyword
		 * ----------------
		 * return keyword help you to return result/data from the method
		 * 1.when we use return keyword then return type of method 
		 * should be same as per your return data
		 * 2. method will return value to the calling function
		 * 3. return statement is always last line of your method
		 * 
		 * 
		 */
		
		int result=c.div(100,10);
		System.out.println("Division is: "+result);

		String res=c.info();
		System.out.println(res);

	}

}
