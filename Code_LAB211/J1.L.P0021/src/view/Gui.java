/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Manage;
import controller.Validation;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Gui {

    private static Scanner sc = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("1. Create\n"
                + "2. Find and Sort\n"
                + "3. Update/Delete\n"
                + "4. Report\n"
                + "5. Exit");
    }
    
    public static void disPlay(){
        Manage m = new Manage();
        do { 
            showMenu();
            int chose = Validation.getInt("Enter your choice: ", 1, 5);
            switch(chose){
                case 1:
                    m.create();
                    break;
                case 2:
                    m.findAndSort();
                    break;
                case 3:
                    m.updateOrDelete();
                    break;
                case 4:
                    m.report();
                    break;
                case 5:
                    return;    
            }
        } while (true);
    }
}
