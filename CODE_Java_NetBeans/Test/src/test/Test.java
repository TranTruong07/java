/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Admin
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        args[0] = "4.5";
//        args[1] = "8.5";
        double sum = 0;
//        double x = Double.parseDouble(args[0]);
//        double y = Double.parseDouble(args[1]);
        for (int i = 0; i< args.length; i++){
            sum += Double.parseDouble(args[i]);
        }
        System.out.println("Sum = "+ sum);
    }
    
}
