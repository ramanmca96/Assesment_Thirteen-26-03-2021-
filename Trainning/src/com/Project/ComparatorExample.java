package com.Project;

import java.util.Comparator;

public class ComparatorExample implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee Emp1 = (Employee) o1;
		Employee Emp2 = (Employee) o2;

		return Emp1.empName.compareTo(Emp2.empName);
	}

}
