
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2k3so
 */
public class MyBrick implements IBrick{

    @Override
    public int f1(List<Brick> t) {
        int count = 0; 
        for (Brick brick : t) {
            if(check(brick.getPlace())){
                count++;
            }
        }
        
        
        return count;
    }
    public boolean check(String s){
        char[] arr = s.toCharArray();
        if(!Character.isDigit(arr[0])){
            return false;
        }
        if(!Character.isLetter(arr[arr.length-1])){
            return false;
        }
        return true;
    }
    
    
    @Override
    public void f2(List<Brick> t) {
        
        int max = 0;
        for (Brick brick : t) {
            if(brick.getPrice() % 2 != 0 && max < brick.getPrice()){
                max = brick.getPrice();
            }
        }
        for (Brick brick : t) {
            if(max == brick.getPrice()){
                brick.setPlace("XX");
                return;
            }
        }
    }

    @Override
    public void f3(List<Brick> t) {
        int max = t.get(0).getPrice();
        for (Brick brick : t) {
            if(max < brick.getPrice()){
                max = brick.getPrice();
            }
        }
        List l = new ArrayList();
        int index = 0;
        for (int i = 0; i< t.size(); i++) {
            if(max == t.get(i).getPrice()){
                index = i;
                break;
            }else{
                l.add(t.get(i));
            }
        }
        
        Collections.sort(l, new Comparator<Brick>() {
            @Override
            public int compare(Brick o1, Brick o2) {
                return o1.getPrice() -o2.getPrice();
            }
        });
        
        for (int i = index; i< t.size(); i++) {
            l.add(t.get(i));
        }
        
        t.clear();
        for (int i = 0; i< l.size(); i++) {
            t.add((Brick) l.get(i));
        }
    }
    
}