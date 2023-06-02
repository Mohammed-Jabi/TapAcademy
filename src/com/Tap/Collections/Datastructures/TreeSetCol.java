package com.Tap.Collections.Datastructures;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

class Employee2 implements Comparable<Employee2>{
	private int id;
	private String name;
	private String email;
	private float salary;

	public Employee2() {
		// TODO Auto-generated constructor stub
	}

	public Employee2(int id, String name, String email, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	 

	@Override
	public int compareTo(Employee2 e1) {
		Employee2 e2 = this; 
		
		Float salary1 = e2.getSalary();
		float salary2 = e1.getSalary();
		
		return salary1.compareTo(salary2);
		
	}




}

public class TreeSetCol {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	
		TreeSet<Employee2> list =	new TreeSet<Employee2>();
		int n = scan.nextInt();

		for(int i=0; i<n; i++) {

			int id = 1001 + i;
			String name = scan.next();
			String email = scan.next();
			float salary = scan.nextFloat();
			Employee2 e = new Employee2(id, name, email, salary);
			list.add(e);

		}
		
		for(Employee2 e : list) {
			System.out.println(e.getId() +","+ e.getName() +","+ e.getEmail() +","+ e.getSalary());
		}

	}

}
