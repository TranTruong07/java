package javaapplication73;

import java.util.Scanner;

public class JavaApplication73 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the first date: ");
        String date1 = sc.nextLine();
        String[] arr1 = date1.split("/");
        System.out.print("Please enter the second date: ");
        String date2 = sc.nextLine();
        String[] arr2 = date2.split("/");

        if (isValidDate(arr1) && isValidDate(arr2)) {
            int year1, year2;
            year1 = Integer.parseInt(arr1[2]);
            year2 = Integer.parseInt(arr2[2]);

            if (year1 < year2) {
                System.out.println("Date1 is before Date2");
            } else if (year2 < year1) {
                System.out.println("Date2 is before Date1");
            } else {
                int month1 = Integer.parseInt(arr1[1]);
                int month2 = Integer.parseInt(arr2[1]);

                if (month1 < month2) {
                    System.out.println("Date1 is before Date2");
                } else if (month2 < month1) {
                    System.out.println("Date2 is before Date1");
                } else {
                    int ngay1 = Integer.parseInt(arr1[0]);
                    int ngay2 = Integer.parseInt(arr2[0]);

                    if (ngay1 < ngay2) {
                        System.out.println("Date1 is before Date2");
                    } else if (ngay2 < ngay1) {
                        System.out.println("Date2 is before Date1");
                    } else {
                        System.out.println("Date2 and Date1 are the same");
                    }
                }
            }
        } else {
            System.out.println("Invalid date(s) entered.");
        }
    }

    public static boolean isValidDate(String[] date) {
        if (date.length != 3) {
            return false;
        }

        int day = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int year = Integer.parseInt(date[2]);

        if (year < 1 || month < 1 || month > 12 || day < 1) {
            return false;
        }

        int maxDays = 31;

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30;
        } else if (month == 2) {
            if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
                maxDays = 29;
            } else {
                maxDays = 28;
            }
        }

        return day <= maxDays;
    }
}