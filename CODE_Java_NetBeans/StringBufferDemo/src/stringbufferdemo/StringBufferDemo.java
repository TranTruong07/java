/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringbufferdemo;

/**
 *
 * @author Admin
 */
public class StringBufferDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringBuffer sBuf = new StringBuffer("01234567");
        System.out.println(sBuf);
        sBuf.append("ABC");
        System.out.println(sBuf);
        sBuf.insert(2, "FAT PERSON");
        System.out.println(sBuf);
        sBuf.reverse();
        System.out.println(sBuf);
    }
    
}
