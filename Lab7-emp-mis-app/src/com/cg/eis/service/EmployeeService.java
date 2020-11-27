package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;

/**
 * The Interface EmployeeService.
 */
public interface EmployeeService {
	
	/**
	 * Adds the employee.
	 *
	 * @param employee the employee
	 * @return the integer
	 * @throws EmployeeException the employee exception
	 */
	public Integer addEmployee(Employee employee) throws EmployeeException;
	
	/**
	 * Delete employee.
	 *
	 * @param empid the empid
	 * @return the integer
	 * @throws EmployeeException the employee exception
	 */
	public Integer deleteEmployee(Integer empid) throws EmployeeException;
	
	/**
	 * Gets the employees by insurance scheme.
	 *
	 * @param insuranceScheme the insurance scheme
	 * @return the employees by insurance scheme
	 * @throws EmployeeException the employee exception
	 */
	public List<Employee> 
	getEmployeesByInsuranceScheme(String insuranceScheme) 
			throws EmployeeException;
	
	public List<Employee> getAllEmployees() throws EmployeeException;
}
