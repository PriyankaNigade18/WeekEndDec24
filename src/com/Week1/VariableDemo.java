package com.Week1;

public class VariableDemo 
{
	//instance variable
	int id=101;
	String name="Sarang";
	static String cname="AISSPMS";

	public void show()
	{
		int marks=90;//local
		System.out.println("Student id is: "+id);
		System.out.println("marks from show(): "+marks);
		System.out.println("College name is: "+cname);
	}
	
	
	public static void main(String[] args) 
	{
		int marks=100;//local
		System.out.println("College name is: "+cname);
		System.out.println("marks from main(): "+marks);

		//object
		VariableDemo v1=new VariableDemo();
		System.out.println("Student id is: "+v1.id);
		System.out.println("Student name is: "+v1.name);
		v1.show();
		

	}

}
