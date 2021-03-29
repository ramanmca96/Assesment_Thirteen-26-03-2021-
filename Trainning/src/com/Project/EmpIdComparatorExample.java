package com.Project;

import java.util.Comparator;

public class EmpIdComparatorExample implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		Employee empId1=(Employee) o1;
		Employee empId2=(Employee) o2;
		
		if (empId1.empId==empId2.empId) {
			return 0;
			}
		
			else if(empId1.empId>empId2.empId) {
				return 1;
			}
			else {
				return -1;
		}
		
	}

}
