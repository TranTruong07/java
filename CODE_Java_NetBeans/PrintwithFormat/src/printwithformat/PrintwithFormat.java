/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printwithformat;

/**
 *
 * @author Admin
 */
public class PrintwithFormat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String S = "Hello";
        int i = 5;
        long l = 58;
        float f = 7.2f;
        double d = 8.9;
        boolean b = true;
        char c = 'A';
        System.out.format("%s, %2d, %4Xh, %5.2f, %10.3f, %3c, %b\n", S, i, l, f, d, c, b);
        System.out.format("%3$3b, %1$3d, %2$12s\n", i, S, b);
    }
    
}
