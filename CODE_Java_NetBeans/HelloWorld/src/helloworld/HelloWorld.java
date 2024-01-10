/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

/**
 *
 * @author Admin
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //System.out.println("Hello luôn");
        int[] ar;
        ar = new int[3];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;
        
        int a2[];
        int[] a3 = new int[]{1, 2, 3, 4};
        int a4[] = {1, 2, 3, 4, 5};
        for (int i : a3) {
            if(i == 4){
                System.out.print(i);
                break;
            }
            System.out.print(i+",");
        }

//        int x = -1;
//        System.out.println("-1<<1: " +(x<<1));
//        System.out.println("-1>>1: " +(x>>1));
//        System.out.println("-1>>>1: " +(x>>>1));
//        System.out.println("3|4: " +(3|4));
//        System.out.println("3&4: " +(3&4));
//        System.out.println("3^4: " +(3^4));
//        String s = "Hello";
//        boolean result = s instanceof String;
//        System.out.println("Hello is an instance of String: " + result);

//        int[] a = {4, 4};
//        int b = 1;
//        a[b] = b = 0;
//        System.out.println("a: "+a[0]+","+a[1]);
          
//        int[] x= new int[] {1, 2, 3,4 , 5};
//        for (int i : x) {
//            System.out.println(i);
//        }
//        short x, y = 256;
//        byte m, n = 6;
//        x = n;
//        n = (byte) y;
//        System.out.println(n);
        System.out.println("helloworld.HelloWorld.main()");
    }
    
}
