package com.Week4.Array_String;

public class ArrayTask1 {

	public static void main(String[] args)
	{
		// sum of all elements of array
		
		int arr[]={10,20,30,40,50};
		
		int sum=0;
		int res=0;
		
		System.out.println("Using simple for loop");
		
		
		for(int i=0;i<arr.length;i++)//i =index of array
		{
			res=res+arr[i];
		}
		
		System.out.println("Sum of Elements: "+res);
		
		System.out.println("Using for each");
		
		for(int i:arr)//i = array value
		{
			sum=sum+i;
			
		}
		
		System.out.println("Sum of elements: "+sum);

	}

}
