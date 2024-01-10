/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyString implements IString{

    @Override
    public int f1(String str) {
        int count = 0;
        String[] arrs = str.split(" ");
        for (String arr : arrs) {
            if(arr == "blue"|| arr == "yellow"|| arr == "red"){
                count++;
            }
        }
        return count;
    }
    
    @Override
    public String f2(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
