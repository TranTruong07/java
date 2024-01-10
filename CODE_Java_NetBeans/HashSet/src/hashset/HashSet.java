/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashset;
import java.util.Iterator;
import java.util.Random;
import java.util.*;
/**
 *
 * @author Admin
 */
public class HashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> nuber = new java.util.HashSet<>();
        for (int i = 0; i < 10; i++) {
            int number = r.nextInt(100);
            nuber.add(number);
        }
        //using Iterator
        Iterator iter = nuber.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }


    }
    
}
