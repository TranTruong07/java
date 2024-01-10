/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int n = 7;
//        Integer intObj = new Integer(5);
//        System.out.println(intObj);
//        System.out.println(intObj.toString());
//        intObj = n;
//        System.out.println(intObj);
//        int y = intObj * 2;
//        int z = intObj.intValue();
//        System.out.println("y = "+ y + ", x = "+ z);
//        n = Integer.parseInt("1234");
//        System.out.println("n = "+ n);
//        n = Integer.parseInt("1A", 16);
//        System.out.println("n = "+ n);
        Random r = new Random();
        for(int i = 0; i< 10; i++){
            int a = r.nextInt(4);
            System.out.println(a);
        }
        
        
    }
    
}
