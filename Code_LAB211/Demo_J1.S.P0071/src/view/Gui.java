/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Manage;
import controller.Validation;

/**
 *
 * @author Admin
 */
public class Gui {

    public static void showMenu() {
        System.out.println("1. AddTask\n"
                + "2. DeleteTask\n"
                + "3. DisplayTasks\n"
                + "4. Exit");
    }
    public static void display(){
        Manage m = new Manage();
        do {            
           showMenu();
           int chose = Validation.getInt("Enter 1-4", 1, 4);
           switch(chose){
               case 1:
                   m.addTask();
                   break;
               case 2:
                   m.deleteTask();
                   break;
               case 3:
                   m.displayTask();
                   break;
               case 4:
                   return;
           }
        } while (true);
    }
}
