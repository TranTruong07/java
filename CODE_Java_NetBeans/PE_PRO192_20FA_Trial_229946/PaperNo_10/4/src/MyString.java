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
        char[] arr = str.toCharArray();
        int count=0;
        for(int i = 0; i< arr.length; i++){
            if(Character.isDigit(arr[i])){
                int a = Integer.parseInt(arr[i]+"");
                if(checkPrime(a)){
                    count++;
                }
            }
        }
        return count;
    }

    @Override
    public String f2(String str) {
        String[] arrs = str.split(" ");
        String news = "";
        for(int i = arrs.length-1; i>=0; i--){
            news += arrs[i] +" ";
        }
        news = news.trim();
        return news;
    }
    public boolean checkPrime(int a){
        if(a == 2 || a== 3){
            return true;
        }
        for(int i = 2; i< a; i++){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
}
