package com.OOP.DataAbstraction;

//Multiple Inheritance 
public class NobelHs implements IMA,USMA
{
	public void medicalService()
	{
		System.out.println("NobelHs......Medical()");
	}

	@Override
	public void cardio() {
		System.out.println("NobelHs......Cardio()");

		
	}

	@Override
	public void dental() {
		System.out.println("NobelHs......Dental()");

		
	}

	@Override
	public void nero() {
		System.out.println("NobelHs......nero()");

		
	}

	@Override
	public void physio() {
		System.out.println("NobelHs.....Physio()");

	}

	@Override
	public void covid19Test() {
		System.out.println("NobelHs....Covid19Test)");

		
	}

}
