/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse_method;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Reverse_method {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] word = s.split(" ");
        for(int i = word.length -1 ; i>=0; i--){
            System.out.print(word[i]+" ");
        }
        
    }
    
}
