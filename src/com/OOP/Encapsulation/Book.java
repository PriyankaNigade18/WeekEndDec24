package com.OOP.Encapsulation;

public class Book 
{

	private int pageno;
	
	public void setPageno(int pno)
	{
		if(pno>=1 && pno<=200)
		{
			System.out.println("Page is available for : "+pno);
			this.pageno=pno;
		}else
		{
			System.out.println("Page Number is Invalid!"+pno);
		}
	}
	
	public int getPageno()
	{
		return pageno;
	}
	
	
	
}
