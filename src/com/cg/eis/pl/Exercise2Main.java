package com.cg.eis.pl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServices;

public class Exercise2Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		List<Employee> schemeA_List = new ArrayList<>();
		List<Employee> schemeB_List = new ArrayList<>();
		List<Employee> schemeC_List = new ArrayList<>();
		List<Employee> noScheme_List = new ArrayList<>();
		System.out.println("For how many employees you want to feed the data: ");
		int n = sn.nextInt();
		Employee employees[] = new Employee[n];
		for (int i=0;i<n;i++) {
			employees[i] = new EmployeeServices().getDetails(i);
			System.out.println("Enter your salary: ");
			double sal = 0;
			if (sn.hasNextDouble())
				sal = sn.nextDouble();
			employees[i].setSalary(sal);
			
			employees[i].setDesignationBasedOnSalary(employees[i].getSalary());
			employees[i].setInsuranceScheme(new EmployeeServices().findScheme(employees[i].getSalary()));
			
			switch (employees[i].getInsuranceScheme()){
			case "Scheme A" : schemeA_List.add(employees[i]);
								break;
			case "Scheme B" : schemeB_List.add(employees[i]);
								break;
			case "Scheme C" : schemeC_List.add(employees[i]);
								break;
			case "No Scheme" : noScheme_List.add(employees[i]);
								break;
			}
			
		}
		
		Map<String, List<Employee>> allSchemeDetails = new HashMap<>();
		allSchemeDetails.put("Scheme A", schemeA_List);
		allSchemeDetails.put("Scheme B", schemeB_List);
		allSchemeDetails.put("Scheme C", schemeC_List);
		allSchemeDetails.put("No Scheme", noScheme_List);
		
		System.out.println("Do you want to see the details of Employees based on Scheme?(y/n)");
		char yn = sn.next().toLowerCase().charAt(0);
		if (yn == 'y') {
			System.out.println("Choose the scheme");
			System.out.println("1. Scheme A");
			System.out.println("2. Scheme B");
			System.out.println("3. Scheme C");
			System.out.println("4. No Scheme");
			
			int choice = sn.nextInt();
			List<Employee> output;
			
			switch (choice) {
			case 1 : output = allSchemeDetails.get("Scheme A");
					break;
			case 2 : output = allSchemeDetails.get("Scheme B");
					break;
			case 3 : output = allSchemeDetails.get("Scheme C");
					break;
			case 4 : output = allSchemeDetails.get("No Scheme");
					break;
			default : output = new ArrayList<>();
				System.out.println("Your choice of scheme doesn't exist!");
			}
			output.forEach(System.out::println);
			
		}
		
		sn.close();

	}

}
