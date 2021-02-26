package com.cg.eis.service;

import java.util.Scanner;

import com.cg.eis.bean.Employee;

public class EmployeeServices implements EmployeeService {

	@Override
	public Employee getDetails(int i) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter the name of Employee " + i + ": ");
		String name = sn.nextLine();
		System.out.println("Enter the ID of Employee: " + i + ": ");
		String id = sn.nextLine();
		return new Employee(id,name);	
	}

	@Override
	public String findScheme(double salary) {
		// TODO Auto-generated method stub
		if (salary > 40000) 
			return "Scheme A";
		else if(salary > 20000) 
			return "Scheme B";
		else  if (salary > 5000)
			return "Scheme C";
		else 
			return "No Scheme";
		
		
	}

	@Override
	public String display(Employee e) {
		// TODO Auto-generated method stub
		return e.toString();
	}
	
	
}
