package com.OOP.Encapsulation;

class EmployeeData
{
	private String name="Sarang";
	private int id=101;
	int salary=78000;
	//public method for private data-getters() and setters()


	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}
	
	
	
	//business logic
	void profile()
	{
		System.out.println("Employee details are:");
		System.out.println("Employee id: "+id);
		System.out.println("Employee name: "+name);
		System.out.println("Employee salary: "+salary);
	}



}



public class EncapsulationDemo {

	public static void main(String[] args)
	{
		EmployeeData e1=new EmployeeData();
		e1.profile();
		e1.salary=90000;
		e1.setId(999);
		e1.setName("Sarang sharma");
		//e1.id=33366;
		//e1.name="Amit";
		e1.profile();

	}

}
