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
            if(check(arr)){
                count++;
            }
        }
        return count;
    }
    
    public boolean check(String s){
        char[] arr = s.toCharArray();
        if(!(arr[arr.length-1] == 'n' || arr[arr.length-1] == 'N'|| arr[arr.length-1] == 'm' || arr[arr.length-1] == 'M')){
            return false;
        }
        return true;
    }
    
    @Override
    public String f2(String str) {
        String[] token = str.split(" ");
        int max = soluong(token[0]);
        int index = 0;
        for (int i = 0; i< token.length; i++) {
            if(max < soluong(token[i])){
                max = soluong(token[i]);
                index = i;
            }
        }
        String news = "";
        for (int i = 0; i< token.length; i++) {
            if(index == i){
                news += revers(token[index])+" ";
                continue;
            }else{
                news += token[i]+" ";
            }
        }
        return news;
    }
    
    public String revers(String s){
        char[] arr = s.toCharArray();
        int i = 0;
        int j = arr.length-1;
        
        while(i < j){
            char tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
        String news = "";
        for (char c : arr) {
            news+= c;
        }
        return news;
    }
    
    public int soluong(String s){
        int count = 0;
        char[] arr = s.toCharArray();
        for (char c : arr) {
            count++;
        }
        return count;
    }
}
