package com.cg.eis.pl;

import java.util.List;
import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.exception.EmployeeException;
import com.cg.eis.service.EmployeeService;
import com.cg.eis.service.EmployeeServiceImpl;

/**
 * The Class EISTester.
 */
public class EISTester {
	
	/** The service. */
	private static EmployeeService service=new EmployeeServiceImpl();
	
	/** The scanner. */
	private static Scanner scanner=new Scanner(System.in);

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		while(true) {
			System.out.println("Enter 1. Add employee 2. List employees based on Insurance Scheme 3. Delete employee 4. List all employees");
			int option= Integer.parseInt(scanner.nextLine());
			try {
				switch(option) {
				case 1: Employee employee=new Employee();
						Integer empid=addEmployee(employee);
						System.out.println("Added employee: "+empid);
						break;
				case 2: System.out.println("Enter insurance scheme");
						String scheme= scanner.nextLine();
						List<Employee> empList=
								getEmployeesByInsuranceScheme(scheme);						
						empList.stream().forEach(System.out::println);
						break;
				case 3: System.out.println("Enter employee id: ");
						empid= Integer.parseInt(scanner.nextLine());
						int id= deleteEmployee(empid);
						System.out.println("Employee: "+id+" deleted");
						break;
				case 4: getAllEmployees();
						break;
				default: System.out.println("Invalid option");
						 break;				
				
				}
				
				
			}catch(EmployeeException e) {
				e.printStackTrace();
			}
			
			System.out.println("Enter y to continue..");
			String ch=scanner.nextLine();
			if(!ch.equalsIgnoreCase("y")) {
				break;
			}
			
			
		}

	}

	/**
	 * Gets the all employees.
	 *
	 * @return the all employees
	 * @throws EmployeeException the employee exception
	 */
	private static void getAllEmployees() throws EmployeeException {
		List<Employee> employeeList= service.getAllEmployees();
		employeeList.stream().forEach(System.out::println);
		
	}

	/**
	 * Delete employee.
	 *
	 * @param empid the empid
	 * @return the int
	 * @throws EmployeeException the employee exception
	 */
	private static int deleteEmployee(Integer empid) throws EmployeeException {		
		 
		return service.deleteEmployee(empid);
	}

	/**
	 * Gets the employees by insurance scheme.
	 *
	 * @param scheme the scheme
	 * @return the employees by insurance scheme
	 * @throws EmployeeException the employee exception
	 */
	private static List<Employee> getEmployeesByInsuranceScheme(String scheme) throws EmployeeException {
		List<Employee> empList= 
				service.getEmployeesByInsuranceScheme(scheme);
		
		return empList;
	}

	/**
	 * Adds the employee.
	 *
	 * @param employee the employee
	 * @return the integer
	 * @throws EmployeeException the employee exception
	 */
	private static Integer addEmployee(Employee employee) throws EmployeeException {
		System.out.println("Enter employee id: ");
		employee.setEmpid(Integer.parseInt(scanner.nextLine()));
		System.out.println("Enter employee name: ");
		employee.setEname(scanner.nextLine());
		System.out.println("Enter employee salary: ");
		employee.setSalary(Double.parseDouble(scanner.nextLine()));
		Integer empid=service.addEmployee(employee);
		return empid;
	}

}
