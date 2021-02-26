package com.cg.eis.bean;

//import com.cg.eis.service.String;

public class Employee {
	
	private String id;
	private String name;
	private double salary;
	private String designation;
	private String insuranceScheme;
	
	public Employee(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	
	public void setDesignationBasedOnSalary(double salary){
		String designation;
		if (salary > 5000 && salary <20000) 
			designation = "System Associate";
		else if(salary>= 20000 && salary <40000)
			designation = "Programmer";
		else if (salary > 40000)
			designation = "Manager";
		else if (salary < 5000)
			designation = "Clerk";
		else
			designation = "No designation given yet";
		
		setDesignation(designation);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}
	
	
	
	
	

}
