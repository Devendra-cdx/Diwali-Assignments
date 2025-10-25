package com.demo.beans;

import java.io.Serializable;
import com.demo.exception.LowAttendanceException;

public class Student implements Serializable {
    private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;

    public Student() {}

    public Student(int rollno, String sname, String course, double attendance_percentage, double score) {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;
    }

    public String calculateGrade() throws LowAttendanceException {
        if (attendance_percentage < 60) {
            throw new LowAttendanceException("Attendance below 60% for student: " + sname);
        }

        if (score >= 90) return "A";
        else if (score >= 75) return "B";
        else if (score >= 60) return "C";
        else if (score >= 40) return "D";
        else return "F";
    }

    public int getRollno() {
        return rollno;
    }

    public double getAttendance_percentage() {
        return attendance_percentage;
    }

    public String getSname() {
        return sname;
    }

    public double getScore() {
        return score;
    }

    public String getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "RollNo: " + rollno + ", Name: " + sname + ", Course: " + course +
                ", Attendance: " + attendance_percentage + "%, Score: " + score;
    }
}
