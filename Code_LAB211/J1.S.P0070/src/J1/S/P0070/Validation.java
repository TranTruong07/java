/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package J1.S.P0070;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String msg, int min, int max) {
        while (true) {
            try {
                System.out.println(msg);
                int x = Integer.parseInt(sc.nextLine());
                if (x >= min && x <= max) {
                   return x; 
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Enter integer number in range: "+min+" --> "+max);
            }
        }
    }

    static String getAccount(String msg, String msgerr) {
        Pattern regex = Pattern.compile("^[0-9]{10}$");
        while (true) {
            try {
                System.out.print(msg);
                String account = sc.nextLine();
                if(regex.matcher(account).find()){
                    return account;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println(msgerr);
            }
        }
    }

    static String getPassword(String msg, String msgerr) {
        Pattern regex1;
        regex1 = Pattern.compile("^[a-zA-Z0-9]{8,31}$");
        Pattern regex2 = Pattern.compile("^[a-zA-Z0-9]*[0-9]+[a-zA-Z0-9]*");
        Pattern regex3 = Pattern.compile("^[a-zA-Z0-9]*[a-zA-Z]+[a-zA-Z0-9]*");
        while (true) {
            try {
                System.out.print(msg);
                String pass = sc.nextLine();
                if(regex1.matcher(pass).find() && regex2.matcher(pass).find()&& 
                        regex3.matcher(pass).find()){
                    return pass;
                }
                throw new Exception();
            } catch (Exception e) {
                System.out.println(msgerr);
            }
        }
    }

}
