package com.cg.esi.exercise2.pl;

import com.cg.eis.exercise2.bean.Employee;
import com.cg.eis.exercise2.service.EmployeeService;
import com.cg.eis.exercise2.service.EmployeeServiceImpl;

/**
 * @author Komal Patil
 * The Class EISDemo.
 */

public class EISDemo {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		EmployeeService emp = new EmployeeServiceImpl(); 
		emp.getEmployeeDetails(e1);
		System.out.println("Insurance Scheme : "+emp.findInsuranceScheme(e1));
		emp.showEmployeeDetails(e1);
	}

}
