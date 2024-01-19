/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ManageEmployee;
import controller.Validation;

/**
 *
 * @author Admin
 */
public class Gui {

    public static void showMenu() {
        System.out.println("1. Add employees \n"
                + "2. Update employees\n"
                + "3. Remove employees\n"
                + "4. Search employees\n"
                + "5. Sort employees by salary\n"
                + "6. Exit");
    }
    
    public static void disPlays(){
        ManageEmployee m = new ManageEmployee();
        do {            
            showMenu();
            int chose = Validation.getInt("Enter your choice: ", 1, 6);
            switch(chose) {
                case 1:
                    m.addEmployee();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    m.search();
                    break;
                case 5:
                    break;
                case 6:
                    return;
            }
        } while (true);
    }

}
