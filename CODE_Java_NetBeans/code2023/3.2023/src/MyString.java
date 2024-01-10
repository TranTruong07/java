/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vu Luong Bao
 */
public class MyString implements IString{

    private boolean evenDigit(String s){
        char s1[]=s.toCharArray();
        for (char c : s1) {
            if(Character.isDigit(c)){
                int s2=(int) c;
                if(s2%2==0) return true;               
        }
    }
        return false;
                
    }
   
    @Override
    public int f1(String str) {     
       
        
//        int count =0;
//        String [] arr= str.split("\\s+");
//        for (String string : arr) {
//            if(evenDigit(string)){                
//                count++;
//            }
//        }
//       return count;
          int count =0;
          for (int i = 0; i < str.length(); i++) {
            char s = str.charAt(i);
            if(Character.isDigit(s)){
                int s1= Integer.parseInt(""+s);
                if(s1 % 2==0) count++;
            }
        }
         return count;
    }

    
    @Override
    public String f2(String str) {
        String result="";
        String found = null;      
        String [] array = str.split("\\s+");
        for (int i = 0; i < array.length; i++) {
            if(isPalidrome(array[i])){
                found = array[i];
               array[i] = "YY";
               break;
            }
        }
        for (String string : array) {
                result+=(string+" ");               
            }
        result= result.trim();
        return result;
    }
    private boolean isPalidrome(String st){
//        for (int i = 0; i < st.length()/2; i++) {
//            if(st.charAt(i) != st.charAt(st.length()-1-i)){
//                return false;
//            }
//        }
//        return true;
//    }

          for (int i = 0; i < st.length()/2; i++) {
            if(st.charAt(i) != st.charAt(st.length()-1-i)){
                return false;
            }           
        }
          return true;
}
}

