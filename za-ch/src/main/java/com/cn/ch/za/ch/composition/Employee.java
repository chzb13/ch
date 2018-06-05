package com.cn.ch.za.ch.composition;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	
	private String name;
	
	private String dept;
	
	private double salary;
	
	private List<Employee> subordinates;


	public Employee(String name, String dept, double salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
		subordinates = new ArrayList<Employee>();
	}
	
	public void add(Employee e){
		subordinates.add(e);
	}
	
	public void remove(Employee e){
		subordinates.remove(e);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public List<Employee> getSubordinates() {
		return subordinates;
	}

	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", dept=" + dept + ", salary="
				+ salary + "]";
	}
	
	
}
