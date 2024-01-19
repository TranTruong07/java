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
import model.Employee;

/**
 *
 * @author Admin
 */
public class ManageEmployee {

    private static Scanner sc = new Scanner(System.in);
    private List<Employee> list;

    public ManageEmployee() {
        this.list = new ArrayList<>();
    }

    public void addEmployee() {
        String id = Validation.getId("Enter id: ", list);
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        String phone = Validation.getPhone("Enter phone number: ");
    }

    public void updateEployee() {
        System.out.println("Enter id: ");
        String id = sc.nextLine();
        if (check(id)) {
            for (Employee employee : list) {
                if (id.equals(employee.getId())) {
                    list.remove(employee);
                }

            }

        } else {
            System.out.println("not found");
        }
    }

    private boolean check(String id) {
        for (Employee employee : list) {
            if (id.equals(employee.getId())) {
                return true;
            }
        }
        return false;
    }

    public void search() {
        System.out.println("Enter Fname or LName: ");
        String x = sc.nextLine();
        for (Employee employee : list) {
            if (x.toLowerCase().contains(employee.getfName().toLowerCase()) || x.toLowerCase().contains(employee.getlName().toLowerCase())) {
                System.out.println(employee.toString());
            }
        }
    }

    public void sort() {
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (o1.getSalary()+"").compareTo(o2.getSalary()+"");
            }
        });
        for (Employee employee : list) {
            System.out.println(employee.toString());
        }
    }
}
