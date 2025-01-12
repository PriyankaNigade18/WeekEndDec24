package com.Week3.ControlFlowStatements;

public class BranchingStatement
{
	//return
	public int add()
	{
		int a=10,b=20;
		int c=a+b;
		return c;
	}

	public static void main(String[] args)
	{
		//break--->to exit from switch and loop body
		
		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;
			}else
			{
				System.out.println(i);
			}
		}

		
		System.out.println("************************");
		
		//Continue- skip certain part of a code
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
				
			}else
			{
				System.out.println(i);
			}
		}
		
		BranchingStatement b1=new BranchingStatement();
		int res=b1.add();
		System.out.println("Addition is: "+res);
		
		
		
		
		
		
		
		
		
		
	}

}
