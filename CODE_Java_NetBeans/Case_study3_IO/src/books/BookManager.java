/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BookManager {
    public static void main(String[] args) {
        String filename = "books.txt";
        Scanner sc = new Scanner(System.in);
        Menu m = new Menu();
        m.add("1. View books");
        m.add("2. Add new book");
        m.add("3. Save to file");
        m.add("4. Quit");
        int userchoice;
        BookList list  = new BookList();
        list.loadBookFromFile(filename);
        do {            
            System.out.println("\nBOOK MANAGER");
            m.print();
            userchoice = m.getUserChoice();
            switch(userchoice){
                case 1: list.print(); break;
                case 2: list.addNewBook(); break;
                case 3: list.saveToFile(filename);
            }
        } while (userchoice>0 && userchoice<m.size());
    }
}
