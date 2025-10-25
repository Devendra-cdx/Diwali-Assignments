package com.demo.test;

import java.util.*;
import com.demo.service.*;

public class TestStudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentServiceImpl();

        int choice;
        do {
            System.out.println("\n---------- Student Management System ----------");
            System.out.println("1. Add New Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Sort by Attendance");
            System.out.println("4. Save to File");
            System.out.println("5. Load from File");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.addNewStudent();
                    break;
                case 2:
                    service.displayAll();
                    break;
                case 3:
                    service.sortByAttendance();
                    break;
                case 4:
                    service.saveAllToFile();
                    break;
                case 5:
                    service.loadFromFile();
                    break;
                case 6:
                    System.out.println("Thank you for visiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);

        sc.close();
    }
}
