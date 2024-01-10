/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package case_study_1_io;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class Menu extends Vector <String>{

    public Menu() {
        super();
    }
    void addMenuItem(String S){
        this.add(S);
    }
    void printMenu(){
        for (String x : this) {
            System.out.println(x);
        }
    }
    int getUserChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Select 1....6: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}
