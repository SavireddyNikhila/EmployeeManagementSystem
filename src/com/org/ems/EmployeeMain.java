package com.org.ems;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("            Employee Management System               ");
		System.out.println();
		
		//Adding Employee Details
		System.out.println("=============Adding Employee details==================");
		EmployeeOperations empObj=new EmployeeOperations();
		empObj.addEmployee(1, "Nikhila", 30000.0, "Java", "Trainee", "India");
		empObj.addEmployee(2, "Sony", 20000.0, "HR", "Manager", "China");
		empObj.addEmployee(3, "Kyle", 25000.0, "TR", "Manager", "Russia");
		empObj.addEmployee(4, "Che", 50000.0, "HR", "Trainee", "China");
		empObj.addEmployee(5, "Honey", 15000.0, "Finance", "Accountant", "India");
		
		empObj.ListEmployees();
		
		//Update employee details
		System.out.println("=============Updating Employee details==================");
		System.out.println("Updating employee details having id:2");
		empObj.UpdateEmployee(2,"Nila",10000.0,"Python","Trainee","India");
		
		//Deleting employee details
		System.out.println("============Deleting Employee Details===================");
		System.out.println("Deleting the employee details having id: 5");
		empObj.DeleteEmployee(5);
		
		//Filtering the employee details
		System.out.println("==========Filtering the Employee Details================");
		System.out.println("Filtering based on id: 2");
		empObj.filterById(2);
		
		System.out.println("Filtering based on department: Trainee");
		empObj.filterByDepartment("Trainee");
		
		System.out.println("Filtering based on Designation: HR");
		empObj.filterByDesignation("HR");
		
		System.out.println("Filtering based on Country: India");
		empObj.filterByCountry("India");
		
		//Sorting in ascendingOrder and descendingOrder
		System.out.println("===========Sorting in Ascendingorder & Descending order=========");
		empObj.sortEmployees();
		empObj.sortEmployeeByName();
		
		//Listing all the employees based on department and designation
		System.out.println("==============Listing employee Details================");
		System.out.println("Listing employee details based on department: TR");
		empObj.ListEmpByDepartment("TR");
		
		System.out.println("Listing employee details based on designation: Manager");
		empObj.ListEmpByDesignation("Manager");
	}

}
