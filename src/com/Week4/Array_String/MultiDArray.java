package com.Week4.Array_String;

public class MultiDArray {

	public static void main(String[] args)
	{
		//using new keyword
		int arr[][]=new int[2][3];
		
		arr[0][0]=10;
		arr[0][1]=20;
		arr[0][2]=30;
		
		arr[1][0]=40;
		arr[1][1]=50;
		arr[1][2]=60;
			
		System.out.println("Number of rows: "+arr.length);
		System.out.println("Number of columns: "+arr[0].length);
		
		System.out.println(arr[1][1]);//50
		//System.out.println(arr[0][3]);//ArrayIndexOutOfBoundsException
		
		System.out.println("*****Iteration using for loop************");
		
		for(int r=0;r<arr.length;r++)
		{
			for(int c=0;c<arr[r].length;c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}

		System.out.println("*****Iteration using foreach loop************");
		for(int r[]:arr)//r=[10,20,30]
		{
			for(int c:r)
			{
				System.out.print(c+" ");
			}
			
			System.out.println();
		}
		
		
		System.out.println("**********************************");
		
		
		//using literal way
		int sid[][]= {{10,20},{30,40},{50,60},{70,80}};
		
		System.out.println("Number of rows: "+sid.length);//4
		System.out.println("Number of columns: "+sid[0].length);//2
		
		System.out.println(sid[2][1]);//60
		
		System.out.println("************Using for loop********");
		
		for(int r=0;r<sid.length;r++)
		{
			for(int c=0;c<sid[r].length;c++)
			{
				System.out.print(sid[r][c]+" ");
			}
			System.out.println();
		}
		System.out.println("************Using foreach loop********");

		for(int r[]:sid)
		{
			for(int c:r)
			{
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
