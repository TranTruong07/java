/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1;

import abc.ClassAbcx;
import java.io.File;

/**
 *
 * @author Admin
 */
public class Test1 {
    int a;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            File d = new File("dir");
            File f = new File(d, "fi.txt");
            if (!f.exists()) {
                f.createNewFile();
            }
        } catch (Exception e) {
        }

        ClassA a = new ClassA();
        ClassAbcx d = new ClassAbcx();
        d.
    }

}
