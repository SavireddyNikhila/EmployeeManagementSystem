package com.org.ems;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private String department;
	private String designation;
	private String country;

	public Employee(int id, String name, double salary, String department, String designation, String country) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.designation = designation;
		this.country = country;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", designation=" + designation + ", country=" + country + "]";
	}
}
