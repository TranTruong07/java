/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slide_scannerdemo2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Slide_ScannerDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File f = new File("f1.txt");
        try {
            Scanner sc = new Scanner(f);
            sc.useDelimiter("[[.]\\d]+");
            while (sc.hasNext())
                System.out.println(sc.next());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
}
