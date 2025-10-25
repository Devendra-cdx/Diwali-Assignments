package com.demo.dao;

import java.io.*;
import java.util.*;
import com.demo.beans.Student;

public class StudentDaoImpl implements StudentDao {
    private static final String FILE_NAME = "students.txt";
    private List<Student> studentList;

    public StudentDaoImpl() {
        studentList = new ArrayList<>();
    }

    @Override
    public void addStudent(Student s) {
        studentList.add(s);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentList;
    }

    @Override
    public void saveStudentsToFile(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(students);
            System.out.println("Students saved successfully in file: " + FILE_NAME);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Student> readStudentsFromFile() {
        List<Student> list = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            list = (List<Student>) ois.readObject();
            System.out.println("Students read successfully from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("File not found or empty.");
            list = new ArrayList<>();
        }
        return list;
    }
}
