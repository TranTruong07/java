/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lowlevelstreamdemo;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Admin
 */
public class LowLeveLStreamDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final char BLANK = 32;
        final String fileName = "LStream.txt";
        int[] a = {1, 2, 3, 4, 5};
        char n = '5';
        try {
            FileOutputStream os = new FileOutputStream(fileName);
            os.write(n);
            os.write(BLANK);
            for(int i = 0; i< 5; i++){
                os.write(a[i]);
                os.write(BLANK);
            }
            for(int i = 0; i< fileName.length(); i++){
                os.write(fileName.charAt(i));
            }
            os.close();
            FileInputStream is = new FileInputStream(fileName);
            int count = is.available();
            System.out.println("The size of file is"+ count+"bytes");
            System.out.println("The content of file: ");
            // read first char
            byte[] bytes = new byte[1];
            is.read(bytes);
            System.out.print(new String(bytes));
            // read blank
            is.read(bytes);
            System.out.print(new String(bytes));
            //read int number
            for(int i = 0; i< 5; i++){
                int tmp = is.read();
                is.read(bytes);
                System.out.print(tmp + new String(bytes));
            }
            bytes = new byte[11];
            is.read(bytes);
            System.out.println(new String(bytes));
            is.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
