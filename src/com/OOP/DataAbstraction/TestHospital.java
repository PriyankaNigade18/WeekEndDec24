package com.OOP.DataAbstraction;

public class TestHospital {

	public static void main(String[] args) {
		// child class ref and child class object
		NobelHs n1=new NobelHs();
		n1.medicalService();//individual
		n1.dental();//inherited abstract
		n1.cardio();//inherited abstract
		
		n1.nero();//inherited abstract
		n1.physio();//inherited abstract
		n1.covid19Test();
		System.out.println("*************************");

		//parent ref and child object
		IMA i1=new NobelHs();
		i1.dental();
		i1.cardio();
		i1.covid19Test();
		
		
		USMA u1=new NobelHs();
		u1.nero();
		u1.physio();
		u1.covid19Test();
	}

}
