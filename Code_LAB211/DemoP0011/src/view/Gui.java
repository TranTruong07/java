/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controler.Manage;
import controler.Validation;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Gui {
    
    public static void display(){
        Scanner sc = new Scanner(System.in);
        do { 
            System.out.println("1. DE - bat ki\n2. BI - bat ki\n3. HEX - bat ki\n4. Exit");
            int chose = Validation.getInt("Enter the integer 1 - 4");
            switch (chose){
                case 1:
                    int a = Validation.getDecimal();
                    Manage.convertFromDE(a);
                    break;
                case 2: 
                    String bi = Validation.getBinary();
                    Manage.convertFromBI(bi);
                    break;
                case 3:
                    String he = Validation.getHexa();
                    Manage.convertFromHEX(he);
                    break;
                case 4:
                    return;
            }
        } while (true);
    }
}
