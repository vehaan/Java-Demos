package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter your salary: ");
		double salary = sn.nextDouble();
		try {
			if (salary < 3000) {
				throw new EmployeeException("Salary can't be below 3000!");
		}
		
		}catch(EmployeeException ee) {
			System.out.println(ee.getMessage());
		}finally {
			sn.close();
		}

	}

}
