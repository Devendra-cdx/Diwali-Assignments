package com.demo.dao;

import java.util.List;
import com.demo.beans.Student;

public interface StudentDao {
    void saveStudentsToFile(List<Student> students);
    List<Student> readStudentsFromFile();
    void addStudent(Student s);
    List<Student> getAllStudents();
}
