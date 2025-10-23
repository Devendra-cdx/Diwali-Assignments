package com.demo.service;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao empDao = new EmployeeDaoImpl();

	@Override
	public void addEmployee(Employee emp) {
		empDao.addEmployee(emp);
	}

	@Override
	public boolean removeEmployee(int empID) {
		return empDao.removeEmployee(empID);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return empDao.getAllEmployees();
	}

	@Override
	public List<Employee> getEmployeesSortedById() {
		return empDao.getEmployeesSortedById();
	}

	@Override
	public Employee findEmployeeByName(String empName) {
		return empDao.findEmployeeByName(empName);
	}

	@Override
	public void readFile(String fname) {
		empDao.readData(fname);
		
	}

	@Override
	public void writeToFile(String fname) {
		empDao.writeData(fname);
	}
		
	}
