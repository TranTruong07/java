/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;

import java.util.*;

/**
 *
 * @author Admin
 */
public class HashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<Integer, String> mymap = new java.util.HashMap<>();
        mymap.put(1, "One");
        mymap.put(2, "Two");
        mymap.put(3, "Three");
        mymap.put(4, "Four");
        Iterator iter = mymap.keySet().iterator();
        while (iter.hasNext()) {
            Object key = iter.next();
            System.out.println(key + ": " + mymap.get(key));
        }

    }
    
}
