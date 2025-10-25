package com.demo.service;

import java.util.*;
import com.demo.beans.Student;
import com.demo.dao.*;
import com.demo.exception.LowAttendanceException;

public class StudentServiceImpl implements StudentService {
    private StudentDao sdao;
    private List<Student> studentList;

    public StudentServiceImpl() {
        sdao = new StudentDaoImpl();
        studentList = new ArrayList<>();
    }

    @Override
    public void addNewStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Course: ");
        String course = sc.nextLine();
        System.out.print("Enter Attendance (%): ");
        double attendance = sc.nextDouble();
        System.out.print("Enter Score: ");
        double score = sc.nextDouble();

        Student s = new Student(roll, name, course, attendance, score);
        sdao.addStudent(s);
        studentList.add(s);
        System.out.println("Student added successfully.\n");
    }

    @Override
    public void displayAll() {
        if (studentList.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\nStudent Details:\n");
        for (Student s : studentList) {
            System.out.println(s);
            try {
                System.out.println("Grade: " + s.calculateGrade());
            } catch (LowAttendanceException e) {
                System.out.println(e.getMessage());
            }
            System.out.println();
        }
    }

    @Override
    public void saveAllToFile() {
        sdao.saveStudentsToFile(studentList);
    }

    @Override
    public void loadFromFile() {
        studentList = sdao.readStudentsFromFile();
    }

    @Override
    public void sortByAttendance() {
        if (studentList.isEmpty()) {
            System.out.println("⚠️ No students to sort.");
            return;
        }

        studentList.sort((s1, s2) -> Double.compare(s2.getAttendance_percentage(), s1.getAttendance_percentage()));
        System.out.println("Students sorted by decreasing attendance.\n");
    }
}
