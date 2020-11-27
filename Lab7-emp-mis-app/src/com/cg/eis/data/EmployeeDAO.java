package com.cg.eis.data;

import java.util.List;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.InsuranceScheme;

/**
 * The Interface EmployeeDAO.
 */
public interface EmployeeDAO {
	
	/**
	 * Adds the employee.
	 *
	 * @param employee the employee
	 * @return the integer
	 * @throws Exception the exception
	 */
	public Integer addEmployee(Employee employee) throws Exception;
	
	/**
	 * Delete employee.
	 *
	 * @param empid the empid
	 * @return the integer
	 * @throws Exception the exception
	 */
	public Integer deleteEmployee(Integer empid) throws Exception;
	
	/**
	 * Gets the employees by insurance scheme.
	 *
	 * @param insuranceScheme the insurance scheme
	 * @return the employees by insurance scheme
	 * @throws Exception the exception
	 */
	public List<Employee> 
	getEmployeesByInsuranceScheme(InsuranceScheme insuranceScheme) 
			throws Exception;
	
	public List<Employee> getAllEmployees() throws Exception;
}
