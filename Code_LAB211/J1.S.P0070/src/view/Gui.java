/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import J1.S.P0070.Ebank;
import J1.S.P0070.Validation;

/**
 *
 * @author Admin
 */
public class Gui {

    public static void disPlay() {
        Ebank e = new Ebank();
        do {
            System.out.println("------------Login Program------------\n"
                    + "1. Login\n"
                    + "2. Load file\n"
                    + "3. Save file\n"
                    + "4. Show data\n"
                    + "5. Exit");
            int x = Validation.getInt("Please choice one option: ", 1, 6);
            switch (x) {
                case 1:
                    e.display();
                    break;
                case 2:
                    e.loadFile("user.txt");
                    break;
                case 3:
                    e.saveFile("user.txt");
                    break;
                case 4:
                    e.showData();
                    break;
                default:
                    return;
            }
        } while (true);
    }
}
