package com.Week1;

public class StudentData 
{
	//class members
	//data
	int id;
	String name;
	
	//method
	public void display()
	{
		System.out.println("Student id is:"+id);
		System.out.println("Student name is: "+name);
	}
	
	public static void main(String[] args) 
	{
	/*
	 * To call member of a class we need Object
	 */
		StudentData s1=new StudentData();
		//s1.display();
		s1.id=101;
		s1.name="Kiran";
		s1.display();
		
		
		StudentData s2=new StudentData();
		s2.id=201;
		s2.name="Geeta";
		s2.display();
		
		
		
		
		
		
		
		

	}

}
