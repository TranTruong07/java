/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class Student {
    private String iD, studentName, semester, courseName;

    public Student(String iD, String studentName, String semester, String courseName) {
        this.iD = iD;
        this.studentName = studentName;
        this.semester = semester;
        this.courseName = courseName;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return String.format("%-10s"+"|"+"%-5s"+"|"+"%-10s", studentName, semester, courseName);
    }
    
}
