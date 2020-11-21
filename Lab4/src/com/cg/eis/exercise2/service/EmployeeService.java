package com.cg.eis.exercise2.service;

import com.cg.eis.exercise2.bean.Employee;

/**
 * @author Komal Patil
 * The Interface EmployeeService.
 */

public interface EmployeeService {
	
	/**
	 * Gets the employee details.
	 *
	 * @param emp the employee
	 */
	public abstract void getEmployeeDetails(Employee emp);
	
	/**
	 * Finds insurance scheme.
	 *
	 * @param emp the employee
	 * @return the string insurance scheme
	 */
	public abstract String findInsuranceScheme(Employee emp);
	
	/**
	 * Shows employee details.
	 *
	 * @param emp the employee
	 */
	public abstract void showEmployeeDetails(Employee emp);
	
}
