package com.Project;

import java.util.ArrayList;
import java.util.Collections;

class Employee {

	int empId;
	String empName;
	
	Status status;

	enum Status {
		PENDING, CONFIRM, REJECTED
	}

	public Employee(int empId, String empName, Status status) {
		super();
		this.empId = empId;
		this.status = status;
		this.empName = empName;

	}

}

class Company {

	public static void main(String[] args) {

		ArrayList<Employee> lists = new ArrayList<Employee>();
		/*
		 * Employee emp1=new Employee(101, "John"); Employee emp2=new Employee(102,
		 * "John"); Employee emp3=new Employee(101, "Harry"); Employee emp4=new
		 * Employee(104, null); Employee emp5=new Employee(105, null);
		 */

		lists.add(new Employee(101, "Zee", Employee.Status.REJECTED));
		lists.add(new Employee(102, "Beta", Employee.Status.CONFIRM));
		lists.add(new Employee(103, "Cama", Employee.Status.REJECTED));
		lists.add(new Employee(105, "Alpha", Employee.Status.CONFIRM));
		lists.add(new Employee(104, "Tom", Employee.Status.PENDING));

		Collections.sort(lists, new ComparatorExample());

		for (Employee employeeName : lists) {

			System.out.println("Employee ID:" + employeeName.empId + "  " + "EmployeeName :" + employeeName.empName + "  "
					+ "Project Status:" + " " +employeeName.status);
		}
		Collections.sort(lists, new EmpIdComparatorExample());

		for (Employee employee : lists) {

			System.out.println("Employee ID:" + employee.empId + "  " + "EmployeeName :" + employee.empName + "  "
					+ "Project Status:" + " " +employee.status);
		}

	}
}
