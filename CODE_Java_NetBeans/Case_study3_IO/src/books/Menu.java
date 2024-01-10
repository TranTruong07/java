/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class Menu extends Vector<String>{

    public Menu() {
        super();
    }
    void addMenuItem(String S){
        this.add(S);
    }
    void print(){
        for (String x : this) {
            System.out.println(x);
        }
    }
    int getUserChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Select 1....4: ");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
}
