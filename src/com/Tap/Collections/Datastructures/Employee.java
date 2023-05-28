package com.Tap.Collections.Datastructures;

import java.util.ArrayList;
import java.util.Scanner;

class Employee1{
	private int id;
	private String name;
	private String email;
	private float salary;

	public Employee1() {
		// TODO Auto-generated constructor stub
	}

	public Employee1(int id, String name, String email, float salary) {
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




}

public class Employee {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);	
		ArrayList<Employee1> list =	new ArrayList<Employee1>();
		int n = scan.nextInt();

		for(int i=0; i<n; i++) {

			int id = 1001 + i;
			String name = scan.next();
			String email = scan.next();
			float salary = scan.nextFloat();
			Employee1 e = new Employee1(id, name, email, salary);
			list.add(e);

		}
		
		for(Employee1 e : list) {
			System.out.println(e.getId() +","+ e.getName() +","+ e.getEmail() +","+ e.getSalary());
		}

	}

}
