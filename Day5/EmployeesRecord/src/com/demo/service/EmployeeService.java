package com.demo.service;

import com.demo.beans.Employee;
import java.util.List;

public interface EmployeeService {
	void addEmployee(Employee emp);

	boolean removeEmployee(int empID);

	List<Employee> getAllEmployees();

	List<Employee> getEmployeesSortedById();

	Employee findEmployeeByName(String empName);

	void readFile(String fname);

	void writeToFile(String string);
}
