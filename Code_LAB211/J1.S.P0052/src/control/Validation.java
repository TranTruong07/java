
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String msg, int min, int max) {
        int n;
        while (true) {
            try {
                System.out.println(msg);
                n = Integer.parseInt(sc.nextLine());
                if (n >= min && n <= max) {
                    break;
                }
                throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer number in range: " + min + ", " + max);
            }
        }
        return n;
    }

    public static float getFloat(String msg, double min, int max) {
        float n;
        while (true) {
            try {
                System.out.println(msg);
                n = Float.parseFloat(sc.nextLine());
                if (n >= min && n <= max) {
                    break;
                }
                throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Please enter an real number in range: " + min + ", " + max);
            }
        }
        return n;
    }

    public static String getName(String msg, List t) {
        String s = "";
        while (true) {
            System.out.println(msg);
            s = sc.nextLine();
            if (check(s, t)) {
                break;
            }
            System.out.println("Name country has exist, Please enter again name country");
        }
        return s;
    }
     private static boolean check(String s, List t) {
        for (Object object : t){
            if(((EastAsiaCountries)object).countryName.equals(s)){
                return false;
            }
        }
        return true;
    }

    
}
