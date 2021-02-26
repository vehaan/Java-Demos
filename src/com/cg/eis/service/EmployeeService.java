package com.cg.eis.service;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	Employee getDetails(int i);
	String findScheme(double salary);
	String display(Employee e);
}
