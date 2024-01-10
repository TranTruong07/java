/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package case_study_2_io;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ItemManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String filename = "items.txt";
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        menu.add("1. Add new Item");
        menu.add("2. Remove an Item");
        menu.add("3. Updated an Item's price");
        menu.add("4. Print the list");
        menu.add("5. Save to files");
        menu.add("6. Quit");
        menu.add("-------------------------------");
        int userChoice;
 //       boolean changed = false;
        NewItems List = new NewItems();
        List.loadStoredCodes(filename);
        do {            
            System.out.println("\nNEW ITEM MANAGER");
            menu.printMenu();
            userChoice = menu.getUserChoice();
            switch(userChoice){
                case 1: List.addNewItem(); break;
                case 2: List.removeItem(); break;
                case 3: List.updatedItem(); break;
                case 4: List.print(); break;
                case 5: List.appendToFile(filename); break;
                default: if(List.size()>0){
                    System.out.println("Save changed Y/N? ");
                    String response = sc.nextLine().toUpperCase();
                    if(response.startsWith("Y"))
                        List.appendToFile(filename);
                }
            }
        } while (userChoice>0 && userChoice< 6);
    }
    
}
