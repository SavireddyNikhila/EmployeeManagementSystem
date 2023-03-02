package com.org.ems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeOperations {
	private List<Employee> emp = new ArrayList<Employee>();

	public void addEmployee(int id, String name, double salary, String department, String designation, String country) {
		emp.add(new Employee(id, name, salary, department, designation, country));

	}

	public void ListEmployees() {
		for (Employee e : emp) {
			System.out.println(e);
		}
	}

	public void UpdateEmployee(int id, String name, double salary, String department, String designation,
			String country) {
		boolean isfound = false;
		for (Employee e : emp) {
			if (id == e.getId())
				isfound = true;
		}
		if (isfound) {
			emp.stream().filter(e -> e.getId() == id).forEach(e -> {
				e.setName(name);
				e.setSalary(salary);
				e.setDepartment(department);
				e.setDesignation(designation);
				e.setCountry(country);
			});
			for (Employee e : emp) {
				System.out.println(e);
			}
		} else
			System.out.println("Sorry!!, unable to update the employee details with the given id");

	}

	public void DeleteEmployee(int id) {
		boolean flag = emp.removeIf(e -> e.getId() == id);
		if (flag) {
			System.out.println("Delated successfully!!");
			for (Employee e : emp) {
				System.out.println(e);
			}
		} else
			System.out.println("Sorry!, unable to delete the employee details with the given id");

	}

//filter by using id
	public void filterById(int id) {
		boolean isfound = false;
		for (Employee e : emp) {
			if (e.getId() == id) {
				isfound = true;
			}
		}
		if (isfound) {
			List<Employee> filteredEmp = emp.stream().filter(e -> e.getId() == id).collect(Collectors.toList());
			for (Employee f : filteredEmp) {
				System.out.println(f);
			}
		} else
			System.out.println("Employee not found with that id");
	}

//filter by using department
	public void filterByDepartment(String department) {
		boolean isfound = false;
		for (Employee e : emp) {
			if (e.getDepartment().equals(department)) {
				isfound = true;
			}
		}
		if (isfound) {
			List<Employee> filteredEmp = emp.stream().filter(e -> e.getDepartment().equals(department))
					.collect(Collectors.toList());
			for (Employee f : filteredEmp) {
				System.out.println(f);
			}
		} else
			System.out.println("Employee not found with that department");
	}

	// filter by using designation
	public void filterByDesignation(String designation) {
		boolean isfound = false;
		for (Employee e : emp) {
			if (e.getDesignation().equals(designation)) {
				isfound = true;
			}
		}
		if (isfound) {
			List<Employee> filteredEmp = emp.stream().filter(e -> e.getDesignation().equals(designation))
					.collect(Collectors.toList());
			for (Employee f : filteredEmp) {
				System.out.println(f);
			}
		} else
			System.out.println("Employee not found with that designation");
	}

	// filter by using country
	public void filterByCountry(String country) {
		boolean isfound = false;
		for (Employee e : emp) {
			if (e.getCountry().equals(country)) {
				isfound = true;
			}
		}
		if (isfound) {
			List<Employee> filteredEmp = emp.stream().filter(e -> e.getCountry().equals(country))
					.collect(Collectors.toList());
			for (Employee f : filteredEmp) {
				System.out.println(f);
			}
		} else {
			System.out.println("Employee not found with the specified country");
		}

	}

//sorting in asc and desc order
	public void sortEmployees() {
		System.out.println("Sorting Employee details in Ascending order"); // ascending order
		Collections.sort(emp, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getId() - e2.getId();
			}
		});
		for (Employee e : emp) {
			System.out.println(e);
		}
		System.out.println();
		System.out.println("Sorting Employee details in Descending order"); // descending order
		Collections.sort(emp, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e2.getId() - e1.getId();
			}
		});
		for (Employee e : emp) {
			System.out.println(e);
		}

	}

	public void sortEmployeeByName() {
		System.out.println("Sorting Employee details based on name");
		Collections.sort(emp, new Comparator<Employee>() {
			public int compare(Employee e1, Employee e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});
		for (Employee e : emp) {
			System.out.println(e);
		}

	}

	public void ListEmpByDepartment(String department) {
		for (Employee e : emp) {
			if (e.getDepartment().equals(department))
				System.out.println(e);
		}
	}

	public void ListEmpByDesignation(String designation) {
		for (Employee e : emp) {
			if (e.getDesignation().equals(designation))
				System.out.println(e);
		}
	}

}
