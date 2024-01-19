/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.ManageEmployee;
import controler.Validation;
import java.util.Scanner;
import model.Employee;

/**
 *
 * @author Admin
 */
public class Gui {
    private static Scanner sc = new Scanner(System.in);
    public static void display(){
        ManageEmployee m = new ManageEmployee();
        do {            
            m.Showmenu();
            int chose = Validation.getInt("Enter Integer 1 - 6", 1);
            switch(chose){
                case 1:
                    String id = Validation.getId("Enter id", 1);
                    //Id, First Name, Last Name, Phone, Email, Address, DOB, Sex, Salary, Agency
                    System.out.println("Enter First Name");
                    String fname = sc.nextLine();
                    System.out.println("Enter Last Name");
                    String lname = sc.nextLine();
                    String phone = Validation.getPhone("Enter Phone number");
                    System.out.println("Enter Email");
                    String email = sc.nextLine();
                    System.out.println("Enter Address");
                    String address = sc.nextLine();
                    int dob = Validation.getInt("Enter DOB", 2);
                    System.out.println("Enter Sex");
                    String sex = sc.nextLine();
                    double salary = Validation.getDouble("Enter Salary");
                    System.out.println("Enter Agency");
                    String agency = sc.nextLine();
                    Employee e = new Employee(id, fname, lname, phone, email, address, sex, agency, dob, salary);
                    m.addEmployee(e);
                    break;
                case 2:
                    String id1 = Validation.getId("Enter id", 2);
                    //Id, First Name, Last Name, Phone, Email, Address, DOB, Sex, Salary, Agency
                    m.updateEmployee(id1);
                    break;
                case 3:
                    String id2 = Validation.getId("Enter id", 2);
                    m.removeEmployee(id2);
                    break;
                case 4:
                    System.out.println("Enter First Name or Last Name");
                    String s = sc.nextLine().trim().toUpperCase();
                    m.searchEmployee(s);
                    break;
                case 5:
                    m.sort();
                    break;
                case 7:
                    m.showEployee();
                    break;
                case 6:
                    return;
            }
        } while (true);
    }
}
