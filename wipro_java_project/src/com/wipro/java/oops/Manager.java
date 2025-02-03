package com.wipro.java.oops;
/**
 * Parent class=Employee
 * child class=ProjectLead
 * Extends is a keyword
 */
public class Manager {

	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String a[])
	{
		//child object is instantiates from child constructor
		//Parent Class consumes the properties and behaviors of child class
		
		Employee employee= new ProjectLead();
		employee.setEmployee_no(1234);
		employee.setName("sankeerth");
		employee.setSalary(30000);
		
		System.out.println(employee.getEmployee_no());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
	}

}
