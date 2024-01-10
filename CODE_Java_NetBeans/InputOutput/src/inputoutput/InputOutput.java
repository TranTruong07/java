/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputoutput;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class InputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[];
        int n;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element: ");
        n = sc.nextInt();
        //n = Integer.parseInt(sc.nextLine());
        a = new int [n];
        for(i = 0; i< n; i++){
            System.out.println("Enter the "+(i+1)+"/"+n+"elenment: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Entered value: ");
        for(i = 0; i< n; i++)
            System.out.format("%5d", a[i]);
        int s = 0;
        for (int x : a) 
            s += x;
        System.out.println("\nSum of value: "+ s);
    }
    
}
