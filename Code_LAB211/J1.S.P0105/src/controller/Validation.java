/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import modle.Product;

/**
 *
 * @author Admin
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);
    private static SimpleDateFormat simple = new SimpleDateFormat("dd/MM/yyyy");

    public static int getInt(String s, int i) {
        int a = 1;
        while (true) {
            System.out.println(s);
            try {
                a = Integer.parseInt(sc.nextLine());
                if (i == 7) {
                    if (a >= 1 && a <= 7) {
                        break;
                    }
                }else if(i == 4){
                    if (a >= 1 && a <= 4) {
                        break;
                    }
                }else{
                    if (a >= 1 && a <= 9) {
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return a;
    }

    public static String getId(String s, int i, List<Product> list) {
        String ss = "";
        while (true) {
            System.out.println(s);
            ss = sc.nextLine();
            if (check(ss, list, i)) {
                break;
            }
        }
        return ss;
    }

    private static boolean check(String ss, List<Product> list, int i) {
        if (i == 1) {
            for (Product product : list) {
                if (product.getId().equals(ss)) {
                    return false;
                }
            }
            return true;
        } else {
            for (Product product : list) {
                if (product.getId().equals(ss)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static String getStorekeeper(String ss, HashMap<String, Boolean> hasmap) {
        String s = "";
        while (true) {
            System.out.println(ss);
            s = sc.nextLine();
            if (hasmap.containsKey(s)) {
                break;
            }
            System.out.println("Not find Storekeeper");
        }
        return s;
    }

    public static Date getDate(String s) {
        Date d1 = null;
        while (true) {
            System.out.println(s);
            try {
                String ss = sc.nextLine();
                if (checkDate(ss)) {
                    return simple.parse(ss);
                }
            } catch (ParseException e) {
                System.out.println(e);
            }
        }
    }

    private static boolean checkDate(String ss) {
        try {
            simple.setLenient(false);
            simple.parse(ss);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public static double getDouble(String s) {
        double x = -1;
        while (true) {
            try {
                System.out.println(s);
                x = Double.parseDouble(sc.nextLine());
                if (x > 1) {
                    break;
                } else {
                    System.out.println("Enter real number than 1");
                }
            } catch (NumberFormatException e) {
                System.out.println(e);
            }
        }
        return x;
    }
}
