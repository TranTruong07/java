/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd_car;

/**
 *
 * @author Admin
 */
public class Tester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sport_car sp = new Sport_car("yellow", 100, false, true);
        System.out.println(sp.output());
    }
    
}
