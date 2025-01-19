package com.Week4.Array_String;

public class Array1DDemo1 {

	/*
	 * Array is static data structure
	 * Array have fixed size and same type of data/object array c an store
	 * Array implemented in java as Object
	 * Array dosen't support method
	 * Array support one property - length
	 * 
	 * Ways
	 * =========
	 * 1.Using new keyword
	 * 2.Using literal
	 */
	public static void main(String[] args)
	{
		// using new keyword
		
		//declaration
		
		int sid[]=new int[5];
		
		//initialization
		sid[0]=101;
		sid[1]=102;
		sid[3]=104;
		sid[4]=105;
		
		//length of array
		System.out.println("Length is: "+sid.length);
		
		//single value
		System.out.println(sid[3]);//104
		System.out.println(sid[2]);//0
		//System.out.println(sid[9]);//ArrayIndexOutOfBoundsException
		
		System.out.println("*********Iteration using for loop***********");
		
		for(int i=0;i<5;i++)
		{
			System.out.println(sid[i]);
		}
		System.out.println("*******************");
		
		for(int i=0;i<sid.length;i++)
		{
			System.out.println(sid[i]);
		}
		System.out.println("*********Iteration using foreach  loop***********");

		
		for(int i:sid)
		{
			System.out.println(i);
		}
		
		
		System.out.println("*******************************");
		
		double marks[]=new double[3];
		marks[0]=67.11;
		marks[1]=45.77;
		marks[2]=68.99;
		
		System.out.println("Length is: "+marks.length);
		
		System.out.println("Total Marks: "+(marks[0]+marks[1]+marks[2]));
		
		System.out.println(marks[2]);
		
		System.out.println("*******Iteration using for loop************");
		
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println(marks[i]);
		}
		
		System.out.println("*********Iteration using foreach  loop***********");
		for(double i:marks)
		{
			System.out.println(i);
		}
		System.out.println("*****************************");

		String loc[]=new String[3];
		loc[0]="Pune";
		loc[1]="Mumbai";
		loc[2]="Nashik";
		
		System.out.println("Total Locations: "+loc.length);
		
		for(int i=0;i<loc.length;i++)
		{
			System.out.println(loc[i]);
		}
		
		System.out.println("*********Iteration using foreach  loop***********");

		for(String i:loc)
		{
			System.out.println(i);
		}
		System.out.println("****************************");
		
		//literal way
		
		int id[]= {11,12,13,14,15};
		
		System.out.println("Total id's: "+id.length);
		
		System.out.println(id[3]);//14
		System.out.println("************Iteration using for loop*********");
		for(int i=0;i<id.length;i++)
		{
			System.out.println(id[i]);
		}
		System.out.println("*********Iteration using foreach  loop***********");
		for(int i:id)
		{
			System.out.println(i);
		}
		
		System.out.println("******************************");
		
		//using new keyword
		
		/*Object empdata[]=new Object[5];
		empdata[0]="Sarang";
		empdata[1]="pune";
		empdata[2]=40;
		empdata[3]='M';
		empdata[4]=988766655L;*/
		//literal
		Object empdata[]= {"Sarang","Pune",40,'M',9988877665L};
		
		System.out.println("Total length: "+empdata.length);
		
		for(int i=0;i<empdata.length;i++)
		{
			System.out.println(empdata[i]);
		}
		
		System.out.println("*********Iteration using foreach  loop***********");

		for(Object i:empdata)
		{
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
