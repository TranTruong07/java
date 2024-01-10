 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2k3so
 */
public class MyString implements IString{

//    @Override
//    public int f1(String str) {
//        String[] s = str.split(" ");
//        int count = 0;
//        for (String st : s) {
//            if(check(st)){
//                count++;
//            }
//        }
//        return count;
//    }
//    
//    public boolean check(String s){
//        char[] c = s.toCharArray();
//        for (char d : c) {
//            if(Character.isDigit(d)){
//                int v = Integer.parseInt(d+"");
//                if(v%2 != 0){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//    @Override
//    public String f2(String str) {
//        String[] s = str.split(" ");
//        int a;
//        String ss = "";
//        for (int i = 0; i< s.length; i++) {
//            if(checkPalindrome(s[i])){
//                s[i] = "XX";
//                break;
//            }
//        }
//        for (String string : s) {
//            ss += string+" ";
//        }
//        ss = ss.trim();
//        return ss;
//    }
//
//    public boolean checkPalindrome(String s){
//        int i = 0; 
//        int j = s.length()-1;
//        while(i<j){
//            if(s.charAt(i) != s.charAt(j)){
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//    }
    
    @Override
    public int f1(String string) {
        String tokens[] = string.split(" ");
        int count = 0;
        for (String token : tokens) {
            if(token.endsWith("m") || token.endsWith("n") ){
                count++;
            }
        }
        return count;
    }

    @Override
    public String f2(String string) {
        String token[] = string.split(" ");
        int indexMax = 0;
        for (int i = 0; i < token.length; i++) {
            int lengthToken = token[i].length();
            int lengthMax = token[indexMax].length();
            if(lengthMax < lengthToken){
                indexMax = i;
            }
        }
        String maxToken = token[indexMax];
        String rs = "";
        for (int i = maxToken.length() - 1; i >= 0; i--) {
            rs += maxToken.charAt(i);
        }
        return rs;
    }
}
