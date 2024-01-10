/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Employee implements Serializable{
    private String id, fName, lName, phone, email, address, sex, agency;
    private int dob;
    private double salary;

    public Employee(String id, String fName, String lName, String phone, String email, String address, String sex, String agency, int dob, double salary) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.sex = sex;
        this.agency = agency;
        this.dob = dob;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", fName=" + fName + ", lName=" + lName + ", phone=" + phone + ", email=" + email + ", address=" + address + ", sex=" + sex + ", agency=" + agency + ", dob=" + dob + ", salary=" + salary + '}';
    }
    
    
    
    
    //demo
    //Allow user update and delete   
    public void updateOrDelete() {
        //if list empty 
        if (sList.isEmpty()) {
            System.err.println("List empty.");
            return;
        }
        System.out.print("Enter id: ");
        String id = sc.nextLine();
        ArrayList<Student> listStudentFindByName = getListStudentById((ArrayList<Student>) sList, id);
        //check list empty
        if (listStudentFindByName.isEmpty()) {
            System.err.println("Not found student.");
            return;
        } else {
            Student student = getStudentByListFound(listStudentFindByName);
            System.out.print("Do you want to update (U) or delete (D) student: ");
            //check user want to update or delete
            if (Validation.checkInputUD()) {
                System.out.print("Enter id: ");
                String idStudent = sc.nextLine();
                System.out.print("Enter name student: ");
                String name = sc.nextLine();
                System.out.print("Enter semester: ");
                String semester = sc.nextLine();
                System.out.print("Enter name course: ");
                String course = sc.nextLine();
                //check user change or not
                //check student exist or not
                if (Validation.checkStudentExist((ArrayList<Student>) sList, id, name, semester, course)) {
                    student.setiD(idStudent);
                    student.setStudentName(name);
                    student.setSemester(semester);
                    student.setCourseName(course);
                    System.err.println("Update success.");
                }
                return;
            } else {
                sList.remove(student);
                count--;
                System.err.println("Delete success.");
            }
        }
    }

    //Get student user want to update/delete in list found
    public Student getStudentByListFound(List<Student> listStudentFindByName) {
        System.out.println("List student found: ");
        int count = 1;
        System.out.printf("%-10s%-15s%-15s%-15s\n", "Number", "Student name",
                "semester", "Course Name");
        //display list student found
        for (Student student : listStudentFindByName) {
            System.out.printf("%-10d%-15s%-15s%-15s\n", count,
                    student.getStudentName(), student.getSemester(),
                    student.getCourseName());
            count++;
        }
        System.out.print("Enter student: ");
        int choice = Validation.getInt("Enter your choice",1, listStudentFindByName.size());
        return listStudentFindByName.get(choice - 1);
    }

    //Get list student find by id
    public static ArrayList<Student> getListStudentById(ArrayList<Student> ls, String id) {
        ArrayList<Student> getListStudentById = new ArrayList<>();
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getiD())) {
                getListStudentById.add(student);
            }
        }
        return getListStudentById;
    }
}
