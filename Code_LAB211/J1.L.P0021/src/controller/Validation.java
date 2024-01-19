/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Student;

/**
 *
 * @author Admin
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    public static int getInt(String msg, int min, int max) {
        while (true) {
            System.out.println(msg);
            int x = Integer.parseInt(sc.nextLine());
            if (x >= min && x <= max) {
                return x;
            }
            System.err.println("Enter again in range: " + min + "->" + max);
        }
    }

    //check student exist
    public static boolean checkStudentExist(ArrayList<Student> ls, String id,
            String studentName, String semester, String courseName) {
        int size = ls.size();
        for (Student student : ls) {
            if (id.equalsIgnoreCase(student.getiD())
                    && studentName.equalsIgnoreCase(student.getStudentName())
                    && semester.equalsIgnoreCase(student.getSemester())
                    && courseName.equalsIgnoreCase(student.getCourseName())) {
                return false;
            }
        }
        return true;
    }

//    static String getIdExist(String enter_id, List<Student> sList) {
//        while (true) {
//            String id = sc.nextLine();
//            for (Student student : sList) {
//                if (student.getiD().equalsIgnoreCase(id)) {
//                    return id;
//                }
//            }
//        }
//    }

    static String regex(String msg, String regex) {
        while (true) { 
            System.out.println(msg);
            String s = sc.nextLine();
            if(s.matches(regex)){
                return s;
            }
            System.out.println("The String Erro");
        }
    }

}
