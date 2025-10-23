package com.demo.dao;

import com.demo.beans.Employee;
import java.util.List;

public interface EmployeeDao {
	void addEmployee(Employee emp);

	boolean removeEmployee(int empID);

	List<Employee> getAllEmployees();

	List<Employee> getEmployeesSortedById();

	Employee findEmployeeByName(String empName);

	void saveEmployeesToFile(String filename);

	void readData(String fname);

	void writeData(String fname);
}
