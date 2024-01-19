/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);
    private static final String DECIMA_REGEX = "[0-9]*";
    private static final String BINARY_REGEX = "[0-1]*";
    private static final String HEXA_REGEX = "[0-9A-F]*";

    public static int getInt(String s) {
        int a = 1;
        while (true) {
            try {
                System.out.println(s);
                a = Integer.parseInt(sc.nextLine());
                if (a >= 1 && a <= 4) {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Please enter integer number 1 - 4");
            }
        }
        return a;
    }

    public static int getDecimal(){
        while (true) {            
            System.out.println("Enter Integer number: ");
            String s = sc.nextLine().trim();
            if(s.matches(DECIMA_REGEX)){
                int a = Integer.parseInt(s);
                return a;
            }
            System.out.println("must enter 0-9");
            System.out.println("enter again");
        }
    }
    public static String getBinary(){
        while (true) {            
            System.out.println("Enter String Integer 0-1: ");
            String s = sc.nextLine().trim();
            if(s.matches(BINARY_REGEX)){
                return s;
            }
            System.out.println("must enter 0||1");
            System.out.println("enter again");
        }
    }
    public static String getHexa(){
        while (true) {            
            System.out.println("Enter 0-9A-F: ");
            String s = sc.nextLine().trim().toUpperCase();
            if(s.matches(HEXA_REGEX)){
                return s;
            }
            System.out.println("must enter 0-9A-F");
            System.out.println("enter again");
        }
    }
}
