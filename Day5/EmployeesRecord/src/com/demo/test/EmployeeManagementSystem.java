package com.demo.test;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		EmployeeService empService = new EmployeeServiceImpl();
		Scanner sc = new Scanner(System.in);
		empService.readFile("EmpData.txt");
		int choice;

		do {
			System.out.println("\n1. Add Employee");
			System.out.println("2. Remove Employee");
			System.out.println("3. Show all Employees");
			System.out.println("4. Show all Employees sorted by ID");
			System.out.println("5. Find Employee by name");
			System.out.println("6. Save all Employees into file");
			System.out.println("7. Quit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter empID: ");
				int id = sc.nextInt();
				System.out.print("Enter empName: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Enter empRole (or leave blank for default): ");
				String role = sc.nextLine();
				Employee emp = role.isBlank() ? new Employee(id, name) : new Employee(id, name, role);
				empService.addEmployee(emp);
				
				System.out.println("----------------------------------------------------------------\n");
				System.out.println("Employee added!");
				System.out.println("----------------------------------------------------------------\n");
				break;

			case 2:
				System.out.print("Enter empID to remove: ");
				int rid = sc.nextInt();
				boolean removed = empService.removeEmployee(rid);
				if (removed) {
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("Employee removed!");
					System.out.println("----------------------------------------------------------------\n");
				}
				else {
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("Employee not found!");
					System.out.println("----------------------------------------------------------------\n");
				}
				break;

			case 3:
				List<Employee> all = empService.getAllEmployees();
				if (all.isEmpty()) {
					System.out.println("No employees.");
				} else {
					System.out.println("----------------------------------------------------------------\n");
					all.forEach(System.out::println);
					System.out.println("----------------------------------------------------------------\n");
				}
				break;

			case 4:
				List<Employee> sorted = empService.getEmployeesSortedById();
				if (sorted.isEmpty()) {
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("No employees.");
					System.out.println("----------------------------------------------------------------\n");
				} else {
					System.out.println("----------------------------------------------------------------\n");
					sorted.forEach(System.out::println);
					System.out.println("----------------------------------------------------------------\n");
				}
				break;

			case 5:
				System.out.print("Enter empName to search: ");
				sc.nextLine();
				String sname = sc.nextLine();
				Employee found = empService.findEmployeeByName(sname);
				if (found == null) {
					System.out.println("----------------------------------------------------------------\n");
					System.out.println("Employee not found.");
					System.out.println("----------------------------------------------------------------\n");
				}
				else {
					System.out.println("----------------------------------------------------------------\n");
					System.out.println(found);
					System.out.println("----------------------------------------------------------------\n");
				}
				break;

			case 6:
				empService.writeToFile("EmpData.txt");
				System.out.println("----------------------------------------------------------------\n");
				System.out.println("Saved to file.");
				System.out.println("----------------------------------------------------------------\n");
				break;

			case 7:
				sc.close();
				System.out.println("----------------------------------------------------------------\n");
				System.out.println("Thank you for visiting.....");
				System.out.println("----------------------------------------------------------------\n");
				System.exit(0);
			default:
				System.out.println("----------------------------------------------------------------\n");
				System.out.println("Invalid choice.");
				System.out.println("----------------------------------------------------------------\n");
			}
		} while (choice != 7);

	}
}
