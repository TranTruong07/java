/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bravee06
 */
public class MyString implements IString{

    @Override
    public int f1(String string) {
       char[] tokens = string.toCharArray();
       int sum = 0;
       for(int i = 0; i< tokens.length; i++){
           boolean checkdigit = Character.isDigit(tokens[i]);
           if(checkdigit){
               int digit = Integer.parseInt(tokens[i]+"");
               if(digit%2==0)sum += digit;
           }
       }
       
       return sum;
    }

    @Override
    public String f2(String string) {
        String str="";
        char[] tokens = string.toCharArray();
        for(int i = 0; i< tokens.length; i++){
            boolean check = Character.isDigit(tokens[i]);
            if(check){
                int digit = Integer.parseInt(tokens[i]+"");
                if(digit % 2 == 0){
                    continue;
                }
            }
            str += tokens[i];
        }
        return str;
    }
    
}
// char[] tokens = string.toCharArray();
//        int sum = 0;
//        for(int i = 0; i < tokens.length;i++){
//            boolean isDigit = Character.isDigit(tokens[i]);
//            if(isDigit){
//                int digit = Integer.parseInt(""+tokens[i]);
//                if(digit % 2 == 0) sum+= digit;
//            }
//        }      
//        return sum;
//      

// 