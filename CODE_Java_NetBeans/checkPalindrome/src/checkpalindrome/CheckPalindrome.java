/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkpalindrome;

/**
 *
 * @author Admin
 */
public class CheckPalindrome {

    
    public boolean checkPalindrome(String s){
        int i = 0; 
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        CheckPalindrome c = new CheckPalindrome();
        String str = "123 12321 abc";
        String[] arr = str.split("\\s+");
        for (String s : arr) {
            if(c.checkPalindrome(s)){
                System.out.println(s);
                break;
            }
        }
    }
    
}
