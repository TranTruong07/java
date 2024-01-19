/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import model.Employee;

/**
 *
 * @author Admin
 */
public class ManageEmployee {

    private Scanner sc = new Scanner(System.in);
    private List<Employee> list;
    private String f = "data.txt";

    public ManageEmployee() {
        this.list = new ArrayList<>();
    }

    public List<Employee> getList() {
        return list;
    }

    public void Showmenu() {
        System.out.println("1. Add employees \n"
                + "2. Update employees\n"
                + "3. Remove employees\n"
                + "4. Search employees\n"
                + "5. Sort employees by salary\n"
                + "6. Exit");
    }

    public void addEmployee(Employee employee) {
        list.add(employee);
        saveUpdateFile((ArrayList<Employee>) list, 1);
    }

    public boolean saveUpdateFile(ArrayList<Employee> l, int i) {
        try {
            OutputStream os;
            if (i == 1) {
                os = new FileOutputStream(f);
            } else {
                os = new FileOutputStream(f, false);
            }
            ObjectOutputStream oos = new ObjectOutputStream(os);
            for (Employee employee : l) {
                oos.writeObject(employee);
            }
            oos.close();
            os.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public boolean loadFile() {
        if (!list.isEmpty()) {
            list.clear();
        }
        try {
            FileInputStream is = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(is);
            while (true) {
                try {
                    Employee employee = (Employee) (ois.readObject());
                    list.add(employee);
                } catch (EOFException eof) {
                    break;
                }
            }
            ois.close();
            is.close();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    public void updateEmployee(String id) {
        loadFile();
        Employee employee = null;
        for (Employee e : list) {
            if (e.getId().equals(id)) {
                employee = e;
            }
        }
        System.out.println("update employee id: " + employee.getId());
        System.out.println("1. First Name\n2. Last Name\n3. Phone\n4. Email\n5. Address\n6. DOB\n7. Sex\n8. Salary\n9. Agency\n10. exit");
        int chose = 1;
        do {
            chose = Validation.getInt("Enter Integer 1 - 9", 2);
            switch (chose) {
                case 1:
                    System.out.println("Enter First Name");
                    String fname1 = sc.nextLine();
                    employee.setfName(fname1);
                    System.out.println("added");
                    break;
                case 2:
                    System.out.println("Enter Last Name");
                    String lname1 = sc.nextLine();
                    employee.setlName(lname1);
                    System.out.println("added");
                    break;
                case 3:
                    String phone1 = Validation.getPhone("Enter Phone number");
                    employee.setPhone(phone1);
                    System.out.println("added");
                    break;
                case 4:
                    System.out.println("Enter Email");
                    String email1 = sc.nextLine();
                    employee.setEmail(email1);
                    System.out.println("added");
                    break;
                case 5:
                    System.out.println("Enter Address");
                    String address = sc.nextLine();
                    employee.setAddress(address);
                    System.out.println("added");
                    break;
                case 6:
                    int dob = Validation.getInt("Enter DOB", 2);
                    employee.setDob(dob);
                    System.out.println("added");
                    break;
                case 7:
                    System.out.println("Enter Sex");
                    String sex1 = sc.nextLine();
                    employee.setSex(sex1);
                    System.out.println("added");
                    break;
                case 8:
                    double salary1 = Validation.getDouble("Enter Salary");
                    employee.setSalary(salary1);
                    System.out.println("added");
                    break;
                case 9:
                    System.out.println("Enter Agency");
                    String agency1 = sc.nextLine();
                    employee.setAgency(agency1);
                    System.out.println("added");
            }
        } while (chose >= 1 && chose <= 9);
        saveUpdateFile((ArrayList<Employee>) list, 2);
    }

    public void removeEmployee(String id) {
        loadFile();
        Iterator<Employee> iterator = list.iterator();
        while (iterator.hasNext()) {
            Employee e = iterator.next();
            if (e.getId().toUpperCase().equals(id)) {
                iterator.remove(); // Sử dụng Iterator để loại bỏ phần tử
            }
        }
        saveUpdateFile((ArrayList<Employee>) list, 2);
    }

    public void searchEmployee(String s) {
        loadFile();
        List<Employee> l = new ArrayList<>();
        for (Employee e : list) {
            if (e.getfName().toUpperCase().contains(s) || e.getlName().toUpperCase().contains(s)) {
                l.add(e);
            }
        }
        if (l.isEmpty()) {
            return;
        }

        for (Employee employee : l) {
            System.out.println(employee.toString());
        }
    }

    public void sort() {
        loadFile();
        if (list.isEmpty()) {
            return;
        }
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getId().compareTo(o2.getId());
            }
        });
        for (Employee employee : list) {
            System.out.println(employee.toString());
        }
        saveUpdateFile((ArrayList<Employee>) list, 2);
    }

    public void showEployee() {
        loadFile();
        for (Employee employee : list) {
            System.out.println(employee.toString());
        }
    }
}
