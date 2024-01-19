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
        System.out.println("1. addTask\n"
                + "2. deleteTask\n"
                + "3. showDataTasks\n"
                + "4. Exit");
    }
    public static void displays(){
        Manage m = new Manage();
        do {            
            showMenu();
            int chose = Validation.getInt("Enter 1-4: ", 1, 4);
            switch(chose){
                case 1:
                    m.addTask();
                    break;
                case 2:
                    m.deleteTask();
                    break;
                case 3:
                    m.showdataTask();
                    break;  
                case 4:
                    return;    
            }
        } while (true);
    }
}
