/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import model.Employee;

/**
 *
 * @author Admin
 */
public class Validation {
    private static ManageEmployee manage = new ManageEmployee();
    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String s, int x) {
        int a = 1;
        while (true) {
            try {
                System.out.println(s);
                a = Integer.parseInt(sc.nextLine());
                if (x == 1) {
                    if (a >= 1 && a <= 6) {
                        break;
                    }
                } else {
                    if (a > 0) {
                        break;
                    }
                }
            } catch (Exception e) {
                if(x == 1){
                System.out.println("Please enter integer number 1 - 6");
                }else{
                    System.out.println("Please enter integer number > 0");
                }
            }
        }
        return a;
    }

    public static String getId(String x, int i) {
        if(!manage.loadFile()){
            System.out.println("Erro load file");
        }
        String s = null;
        while (true) {
            try {
                System.out.println(x);
                s = sc.nextLine();
                if (check(manage.getList(), i, s)) {
                    break;
                }
            } catch (Exception e) {
                if (i == 1) {
                    System.out.println("The id has exits, Enter again");
                } else {
                    System.out.println("The id not exits, Enter again");
                }
            }
        }
        return s;
    }

    private static boolean check(List<Employee> list, int i, String s) {
        if (i == 1) {
            for (Employee employee : list) {
                if (employee.getId().equals(s)) {
                    return false;
                }
            }
            return true;
        } else {
            for (Employee employee : list) {
                if (employee.getId().equals(s)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static String getPhone(String s) {
        String a = null;
        System.out.println(s);
        while (true) {
            try {
                a = sc.nextLine();
                Pattern pattern = Pattern.compile("^[0-9]+$");
                Matcher matcher = pattern.matcher(a);
                if(matcher.matches()){
                    break;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Please enter the phone number");
            }
        }
        return a;
    }

    public static double getDouble(String s) {
        double a = 1;
        System.out.println(s);
        while (true) {
            try {
                a = Double.parseDouble(sc.nextLine());
                if(a>0){
                    break;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Please enter real number");
            }
        }
        return a;
    }
}
