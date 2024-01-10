/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package case_study_1_io;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ManageProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "employees.txt";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("1. Add new employee");
        menu.add("2. Remove an employee");
        menu.add("3. Promoting the employee's salary");
        menu.add("4. Print the list");
        menu.add("5. Save to files");
        menu.add("6. Quit");
        menu.add("-------------------------------");
        int userChoice;
        boolean changed = false;
        EmpList list = new EmpList();
        list.AddFromFile(filename);
        
        do {            
            System.out.println("\nEMPLOYEE MANAGE");
            menu.printMenu();
            userChoice = menu.getUserChoice();
            switch(userChoice){
                case 1: list.addNewEmp(); changed = true; break;
                case 2: list.removeEmp(); changed = true; break;
                case 3: list.promote(); changed = true; break;
                case 4: list.print(); break;
                case 5: list.saveToFile(filename); changed = false;
                default: if(changed){
                    System.out.println("Save changed Y/N? ");
                    String response = sc.nextLine().toUpperCase();
                    if(response.startsWith("Y"))
                        list.saveToFile(filename);
                }
            }
        } while (userChoice>0 && userChoice< 6);
    }
    
}
