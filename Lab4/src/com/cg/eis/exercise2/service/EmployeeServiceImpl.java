package com.cg.eis.exercise2.service;

import java.util.Scanner;

import com.cg.eis.exercise2.bean.Designation;
import com.cg.eis.exercise2.bean.Employee;

/**
 * @author Komal Patil
 * The Class EmployeeServiceImpl.
 */

public class EmployeeServiceImpl implements EmployeeService{
	
	/**
	 * Instantiates a new employee service impl.
	 */
	public EmployeeServiceImpl(){
		
	}
	
	private static Scanner sc = new Scanner(System.in);
	
	/**
	 * Gets the employee details.
	 *
	 * @param emp the employee
	 */
	@Override
	public void getEmployeeDetails(Employee emp) {
		
		System.out.println("Enter employee details:");
		
		System.out.println("Enter employee id:");
		emp.setId(Integer.parseInt(sc.nextLine()));
		
		System.out.println("Enter employee name:");
		emp.setName(sc.nextLine());
		
		System.out.println("Enter employee salary:");
		emp.setSalary(Double.parseDouble(sc.nextLine()));
		
		System.out.println("Enter employee designation(SYSTEM_ASSOCIATE, MANAGER, PROGRAMMER, CRERK):");
		String des = sc.nextLine();
		
		if(des.equalsIgnoreCase("system_associate"))
			emp.setDesignation(Designation.SYSTEM_ASSOCIATE);
		else if (des.equalsIgnoreCase("manager"))
			emp.setDesignation(Designation.MANAGER);
		else if(des.equalsIgnoreCase("programmer"))
			emp.setDesignation(Designation.PROGRAMMER);
		else if(des.equalsIgnoreCase("clerk"))
			emp.setDesignation(Designation.CLERK);
	}

	/**
	 * Finds insurance scheme.
	 *
	 * @param emp the employee
	 * @return the string insurance scheme
	 */
	@Override
	public String findInsuranceScheme(Employee emp) {
		
		// set insurance scheme based on designation and salary
		/*
		 * Salary				Designation			Insurance scheme
		 * >5000 and < 20000	System Associate	Scheme C
		 * >=20000 and <40000	Programmer			Scheme B
		 * >=40000				Manager				Scheme A
		 * <5000 				Clerk				No Scheme
		 */
		
		Designation desig = emp.getDesignation();
		Double salary = emp.getSalary();
		String scheme = null;
		
		if(desig.equals(Designation.SYSTEM_ASSOCIATE) && (salary > 5000 && salary < 20000))
			scheme = "Scheme C";
		else if(desig.equals(Designation.PROGRAMMER) && (salary >= 20000 && salary < 40000))
			scheme = "Scheme B";
		else if(desig.equals(Designation.MANAGER) && (salary >= 40000))
			scheme = "Scheme A";
		else if(desig.equals(Designation.CLERK) && (salary < 5000))
			scheme = "No Scheme";
		
		emp.setInsuranceScheme(scheme);
		return scheme;
	}

	/**
	 * Shows employee details.
	 *
	 * @param emp the employee
	 */
	@Override
	public void showEmployeeDetails(Employee emp) {
		
		System.out.println("Employee Details:");
		System.out.println(emp);
		
	}

}
