/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import model.Report;
import model.Student;

/**
 *
 * @author Admin
 */
public class Manage {

    private List<Student> sList;
    private int count;
    private static Scanner sc = new Scanner(System.in);
    private String[] typeCourses = {"Java", ".Net", "C/C++"};

    public Manage() {
        this.sList = new ArrayList<>();
        this.count = 0;
    }

    private void showtypeCourses() {
        System.out.println("1. Java\n" + "2. .Net\n" + "3. C/C++");
    }

    public void create() {
        if (count <= 10) {
            System.out.println("Enter id");
            String id = sc.nextLine();
            String studentName = getName("Enter studentName", sList, id);
            System.out.println("Enter semester");
            String semester = sc.nextLine();
            System.out.println("Select courseName");
            showtypeCourses();
            int chose = Validation.getInt("Enter your choice: ", 1, 3);
            String courseName = typeCourses[chose - 1];
            if (checkSListExit(sList, id, studentName, semester, courseName)) {
                System.err.println("information of student duplicate!");
            } else {
                Student s = new Student(id, studentName, semester, courseName);
                sList.add(s);
                System.out.println("added successfull");
                count++;
            }
        } else {
            System.out.println("Do you want to continue (Y/N)");
            String s = sc.nextLine();
            if (s.equalsIgnoreCase("Y")) {
                System.out.println("Enter id");
                String id = sc.nextLine();
                String studentName = getName("Enter studentName", sList, id);
                System.out.println("Enter semester");
                String semester = sc.nextLine();
                System.out.println("Select courseName");
                showtypeCourses();
                int chose = Validation.getInt("Enter your choice: ", 1, 3);
                String courseName = typeCourses[chose - 1];
                if (checkSListExit(sList, id, studentName, semester, courseName)) {
                    System.err.println("information of student duplicate!");
                } else {
                    Student s1 = new Student(id, studentName, semester, courseName);
                    sList.add(s1);
                    System.out.println("added successfull");
                    count++;
                }
            } else {
                return;
            }
        }

    }

    private String getName(String msg, List<Student> sList, String id) {
        while (true) {
            try {
                String studentName = Validation.regex("Enter name student", "^[a-zA-Z ]+$");
                for (Student s : sList) {
                    if (id.equalsIgnoreCase(s.getiD())) {
                        if (studentName.equalsIgnoreCase(s.getStudentName())) {
                            return studentName;
                        }
                        throw new Exception("erro name student");
                    }
                }
                return studentName;
            } catch (Exception e) {
                System.err.println(e);
            }
        }
    }

    private boolean checkSListExit(List<Student> sList, String id, String studentName, String semester, String courseName) {
        if (sList.isEmpty()) {
            return false;
        }
        for (Student s : sList) {
            if (s.getiD().equalsIgnoreCase(id)
                    && s.getStudentName().equalsIgnoreCase(studentName)
                    && s.getSemester().equalsIgnoreCase(semester)
                    && s.getCourseName().equalsIgnoreCase(courseName)) {
                return true;
            }
        }
        return false;
    }

    public void report() {
        if (sList.isEmpty()) {
            System.err.println("List is empty");
            return;
        }
        List<Report> rList = new ArrayList<>();
        System.out.println("Enter id student to show report");
        String id = sc.nextLine();
        List<Student> tmp = getStudentById(id);
        if(tmp.isEmpty()){
            System.out.println("List Student By Id is empty");
            return;
        }
        for (int i = 0; i < tmp.size(); i++) {
            for (Student s : tmp) {
                int total = 0;
                String xid = s.getiD();
                String studentName = s.getStudentName();
                String semester = s.getSemester();
                String courseName = s.getCourseName();
                for (Student st : tmp) {
                    if (st.getiD().equalsIgnoreCase(id) && st.getStudentName().equalsIgnoreCase(studentName)
                            && st.getCourseName().equalsIgnoreCase(courseName)) {
                        total++;
                    }
                }
                if (!checkRListExit(rList, studentName, courseName, total)) {
                    Report r = new Report(studentName, courseName, total);
                    rList.add(r);
                }
            }
        }

        // print rLisst
        for (Report report : rList) {
            System.out.println(report.toString());
        }
    }

    private boolean checkRListExit(List<Report> rList, String studentName, String courseName, int total) {
        if (rList.isEmpty()) {
            return false;
        }
        for (Report r : rList) {
            if (r.getStudentName().equalsIgnoreCase(studentName)
                    && r.getCourseName().equalsIgnoreCase(courseName) && r.getTotalCourse() == total) {
                return true;
            }
        }
        return false;
    }

    public void findAndSort() {
        if (sList.isEmpty()) {
            return;
        }
        System.out.println("Enter Name Student");
        String name = sc.nextLine();
        List<Student> listFAS = getListByName(sList, name);
        if (listFAS.isEmpty()) {
            System.err.println("Not found student");
            return;
        }
        for (Student student : listFAS) {
            System.out.println(student.toString());
        }

        System.out.println("Sort student by Name");
        Collections.sort(listFAS, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getStudentName().compareTo(o2.getStudentName());
            }
        });
        for (Student student : listFAS) {
            System.out.println(student.toString());
        }
    }

    private List<Student> getListByName(List<Student> sList, String name) {
        List<Student> temp = new ArrayList<>();
        for (Student s : sList) {
            if (s.getStudentName().contains(name)) {
                temp.add(s);
            }
        }
        return temp;
    }
    
    public void updateOrDelete(){
        if(sList.isEmpty()){
            System.err.println("List is emplty");
            return;
        }
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        ArrayList<Student> listByID = getStudentById(id);
        if(listByID.isEmpty()){
            System.out.println("Not found the student");
            return;
        }
        Student student = getStudentByListFound(listByID);
        String ud = Validation.regex("Enter U or D: ", "^[UDud]+$");
        if(ud.equalsIgnoreCase("u")){
            String studentName = getName("Enter studentName", sList, id);
            System.out.println("Enter semester");
            String semester = sc.nextLine();
            System.out.println("Select courseName");
            showtypeCourses();
            int chose = Validation.getInt("Enter your choice: ", 1, 3);
            String courseName = typeCourses[chose - 1];
            if (checkSListExit(sList, id, studentName, semester, courseName)) {
                System.out.println("No thing change");
                return;
            } else {
                student.setStudentName(studentName);
                student.setSemester(semester);
                student.setCourseName(courseName);
                System.out.println("update successfull");
            }
            return;
        }else{
            sList.remove(student);
            count--;
            System.out.println("has been remove");
        }
        
    }

    private ArrayList<Student> getStudentById(String id) {
        ArrayList<Student> tmp = new ArrayList<>();
        for (Student student : sList) {
            if(student.getiD().equalsIgnoreCase(id)){
                tmp.add(student);
            }
        }
        return tmp;
    }

    private Student getStudentByListFound(ArrayList<Student> listByID) {
        int count = 1;
        for (Student student : listByID) {
            System.out.format("%d"+"|"+"%-10s"+"|"+"%-5s"+"|"+"%-10s", count++, student.getStudentName(), student.getSemester(), student.getCourseName());
            System.out.println("");
        }
        int a = Validation.getInt("Enter STT Student", 1, listByID.size());
        return listByID.get(a-1);
    }

    
}
