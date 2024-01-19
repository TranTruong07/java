/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Manage {

    private static Scanner sc = new Scanner(System.in);

    public static void convertFromDE(int a) {
        System.out.println("convert to: \nBI \nHEX");
        String b = sc.nextLine().trim().toUpperCase();
        switch(b){
            case "BI":
                convertDeToBi(a);
                break;
            case "HEX":
                convertDeToHex(a);
                break;
        }
    }
    public static void convertFromBI(String a) {
        System.out.println("convert to: \nDE \nHEX");
        String b = sc.nextLine().trim().toUpperCase();
        switch(b){
            case "DE":
                convertBiToDe(a);
                break;
            case "HEX":
                convertBiToHex(a);
                break;
        }
    }
    public static void convertFromHEX(String a) {
        System.out.println("convert to: \nDE \nBI");
        String b = sc.nextLine().trim().toUpperCase();
        switch(b){
            case "DE":
                convertHexToDe(a);
                break;
            case "BI":
                convertHexToBI(a);
                break;
        }
    }
    private static void convertDeToBi(int a) {
        String bi = Integer.toBinaryString(a);
        System.out.println(bi);
    }

    private static void convertDeToHex(int a) {
        String he = Integer.toHexString(a);
        System.out.println(he.toUpperCase());
    }

    private static void convertBiToDe(String a) {
        int de = Integer.parseInt(a, 2);
        System.out.println(de);
    }

    private static void convertBiToHex(String a) {
        int de = Integer.parseInt(a, 2);
        String he = Integer.toHexString(de);
        System.out.println(he.toUpperCase());
    }

    private static void convertHexToDe(String a) {
        int de = Integer.parseInt(a, 16);
        System.out.println(de);
    }

    private static void convertHexToBI(String a) {
        int de = Integer.parseInt(a, 16);
        String bi = Integer.toBinaryString(de);
        System.out.println(bi);
    }
}
