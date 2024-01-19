/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
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

    private static Scanner sc = new Scanner(System.in);
//1     6

    public static int getInt(String msg, int min, int max) {
        System.out.println(msg);
        int x = -1;
        while (true) {
            try {
                x = Integer.parseInt(sc.nextLine());
                if (x >= min && x <= max) {
                    break;
                }
                System.out.println("please enter from " + min + " - " + max);
            } catch (NumberFormatException e) {
                System.out.println("Enter Integer number in range: " + min + " - " + max);
            }
        }
        return x;
    }

    public static String getId(String msg, List<Employee> list) {
        System.out.println(msg);
        String x = "";
        while (true) {
            x = sc.nextLine();
            if (check(x, list)) {
                return x;
            } else {
                System.out.println("duplicate Id, Enter again: ");
            }
        }
    }

    private static boolean check(String x, List<Employee> list) {
        for (Employee e : list) {
            if (e.getId().equals(x)) {
                return false;
            }
        }
        return true;
    }

    public static String getPhone(String msg) {
        System.out.println(msg);
        String data = "";
        while (true) {
            try {
                data = sc.nextLine();
                Pattern pattern = Pattern.compile("^[0-9]+$");
                Matcher matcher = pattern.matcher(data);
                if (matcher.matches()) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("sai chuoi r bn ei");
            }
            
        }
        return data;
    }

}
