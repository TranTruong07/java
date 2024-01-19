/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0103;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SP0103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first date: ");
        String date1 = sc.nextLine();
        String[] arr1 = date1.split("/");
        System.out.print("Please enter the second date: ");
        String date2 = sc.nextLine();
        String[] arr2 = date2.split("/");
        int year1, year2;
        year1 = Integer.parseInt(arr1[2]);
        year2 = Integer.parseInt(arr2[2]);
        if (year1 < year2) {
            System.out.println("Date1 is before Date2");
            return;
        } else if (year2 < year1) {
            System.out.println("Date2 is before Date1");
            return;
        } else {
            int month1 = Integer.parseInt(arr1[1]);
            int month2 = Integer.parseInt(arr2[1]);
            if (month1 < month2) {
                System.out.println("Date1 is before Date2");
                return;
            } else if (month2 < month1) {
                System.out.println("Date2 is before Date1");
                return;
            } else {
                int ngay1 = Integer.parseInt(arr1[0]);
                int ngay2 = Integer.parseInt(arr2[0]);
                if (ngay1 < ngay2) {
                    System.out.println("Date1 is before Date2");
                    return;
                } else if (ngay2 < ngay1) {
                    System.out.println("Date2 is before Date1");
                    return;
                }else{
                    System.out.println("Date2 and Date1 is the same");
                    return;
                }
            }
        }

    }

}
