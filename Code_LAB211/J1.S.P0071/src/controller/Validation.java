/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Validation {
    private static SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
    private static Scanner sc = new Scanner(System.in);
    public static int getInt(String msg, int min, int max){
        int x = -1;
        System.out.println(msg);
        while (true) {            
            try {
               x = Integer.parseInt(sc.nextLine());
               if(x <= max && x >= min){
                   break;
               }
               throw new Exception();
            } catch (Exception e) {
                System.out.println("Please enter integer number in range: "+min+" - "+max);
            }
        }
        return x;
    }

    static Date getDate(String msg) {
        Date date = null;
        System.out.println(msg);
        while (true) {            
            String d = sc.nextLine();
            try {
                if(check(d)){
                    date = SDF.parse(d);
                    return date;
                }throw new Exception();
            } catch (Exception e) {
                System.out.println("Please enter date format: dd/MM/yyyy");
            }
        }
    }

    static double getDouble(String msg, double min, double max) {
        double x = -1;
        System.out.println(msg);
        while (true) {            
            try {
                x = Double.parseDouble(sc.nextLine());
                if(x>= min && x<=max){
                    if((x*10)%5==0){
                        return x;
                    }throw new Exception("Enter real number EXP: 8.0, 8.5.....");
                }throw new Exception("Enter real number in range: "+min+" - "+max);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    private static boolean check(String d) {
        SDF.setLenient(false);
        try {
            SDF.parse(d);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
