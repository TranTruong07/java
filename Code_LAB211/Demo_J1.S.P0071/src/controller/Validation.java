/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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

    public static int getInt(String msg, int min, int max) {
        int x = -1;
        while (true) {
            System.out.println(msg);
            try {
                x = Integer.parseInt(sc.nextLine());
                if (x >= min && x <= max) {
                    break;
                }
                System.out.println("Enter again");
            } catch (Exception e) {
                System.out.println("Enter Integer number in range: "+min+"-"+max);
            }
        }
        return x;
    }

    static Date getDate(String msg) {
        Date x = null;
        while (true) {
            System.out.println(msg);
            try {
                String date = sc.nextLine();
                if(check(date)){
                    x = SDF.parse(date);
                    break;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Enter date fomat dd/MM/yyyy: ");
            }
        }
        return x;
        
    }

    static double getDouble(String msg, double min, double max) {
        double x = -1;
        while (true) {
            System.out.println(msg);
            try {
                x = Double.parseDouble(sc.nextLine());
                if (x >= min && x <= max) {
                    if((x*10)%5==0){
                        break;
                    }else{
                        System.out.println("Enter real number: EX 8.5, 9.0, 9.5");
                    }
                }
                System.out.println("Enter again in range: "+min+"-"+max);
            } catch (Exception e) {
                System.out.println("Enter Integer number in range: "+min+"-"+max);
            }
        }
        return x;
    }

    private static boolean check(String date) {
        SDF.setLenient(false);
        try {
            SDF.parse(date);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
