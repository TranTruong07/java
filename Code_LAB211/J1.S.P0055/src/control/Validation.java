/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import model.Doctor;

/**
 *
 * @author Admin
 */
public class Validation {

    public static Scanner sc = new Scanner(System.in);

    public static int getInt(String msg, int chose) {
        int n;
        while (true) {
            try {
                System.out.println(msg);
                n = Integer.parseInt(sc.nextLine());
                if (chose == 1) {
                    if (n >= 1 && n <= 5) {
                        break;
                    }
                } else {
                    if (n >= 0) {
                        break;
                    }
                }
                throw new NumberFormatException();
            } catch (NumberFormatException e) {
                if(chose == 1){
                    System.out.println("Please enter the number in range 1 to 5");
                }else{
                    System.out.println("Please enter the integer number >= 0");
                }
            }
        }
        return n;
    }

    public static String getId(String msg, HashMap<String, Doctor> hashMap, int chose) {
        String s = "";
        while (true) {
            System.out.println(msg);
            s = sc.nextLine();
            if (chose == 1) {
                if (check(s, hashMap)) {
                    break;
                }
                System.out.println("The id doctor has exist, Please enter again id");
            } else {
                if (!check(s, hashMap)) {
                    break;
                }
                System.out.println("The id doctor not exist, Please enter again id");
            }
        }
        return s;
    }

    private static boolean check(String s, HashMap<String, Doctor> hashMap) {
        for (Map.Entry<String, Doctor> entry : hashMap.entrySet()) {
            if (s.equals(entry.getKey())) {
                return false;
            }
        }
        return true;
    }
}
