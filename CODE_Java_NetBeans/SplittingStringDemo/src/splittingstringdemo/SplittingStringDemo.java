/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package splittingstringdemo;

import java.util.StringTokenizer;

/**
 *
 * @author Admin
 */
public class SplittingStringDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "I study hard. So, I pass the examination";
        // Using the method String[] split() of the String class
        String[] strs = str.split("[ ,.]+");
        for (String s : strs) {
            System.out.println(s);
        }
        System.out.println();
        // Using the java.util.StringTokenizer class
        StringTokenizer stk = new StringTokenizer(str, "[ ,.]");
        System.out.println("Number of substrings: "+stk.countTokens());
        while (stk.hasMoreTokens())
            System.err.println(stk.nextToken());
    }
    
}
