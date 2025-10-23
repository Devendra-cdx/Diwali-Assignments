package com.demo.dao;

import com.demo.beans.Employee;
import java.util.*;
import java.io.*;

public class EmployeeDaoImpl implements EmployeeDao {
	private List<Employee> employeeList = new ArrayList<>();

	@Override
	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}

	@Override
	public boolean removeEmployee(int empID) {
		return employeeList.removeIf(emp -> emp.getEmpID() == empID);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return new ArrayList<>(employeeList);
	}

	@Override
	public List<Employee> getEmployeesSortedById() {
		List<Employee> sorted = new ArrayList<>(employeeList);
		Collections.sort(sorted);
		return sorted;
	}

	@Override
	public Employee findEmployeeByName(String empName) {
		for (Employee emp : employeeList) {
			if (emp.getEmpName().equalsIgnoreCase(empName)) {
				return emp;
			}
		}
		return null;
	}

	@Override
	public void saveEmployeesToFile(String filename) {
		// TODO Auto-generated method stub
		
	}
	@SuppressWarnings("unchecked")
	public void readData(String fname) {
	    File f = new File(fname);
	    if(f.exists()) {
	        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream(fname))) {
	            employeeList = (ArrayList<Employee>) ois.readObject();
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (EOFException e) {
	            System.out.println("Reached end of file");
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	    }
	    System.out.println("size: " + employeeList.size());
	}


	public void writeData(String fname) {
	    try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname))) {
	        oos.writeObject(employeeList);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}


		
}
