
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class MyPen implements IPen{

    @Override
    public int f1(List<Pen> t) {
        int count = 0; 
        for (Pen pen : t) {
            if(check(pen.getName())){
                count++;
            }
        }
        return count;
    }
    public boolean check(String s){
        char[] arr = s.toCharArray();
        for (char c : arr) {
            if(c == 'A'){
                return true;
            }
        }
        return false;
    }
    @Override
    public void f2(List<Pen> t) {
        int max = -1;
        for (Pen pen : t) {
            if(pen.getPrice() > max && pen.getPrice()%2==0){
                max = pen.getPrice();
            }
        }
        for (Pen pen : t) {
            if(max == pen.getPrice()){
                t.remove(pen);
                return;
            }
        }
    }

    @Override
    public void f3(List<Pen> t) {
        
        List l = new ArrayList();
        int index = 0;
        for (int i = 2; i<= 6; i++) {
            l.add(t.get(i));
        }
        
        Collections.sort(l,new Comparator<Pen>() {
            @Override
            public int compare(Pen o1, Pen o2) {
                if(o1.getName().equals(o2.getName())){
                    return (o1.getPrice()-o2.getPrice());
                }
                return o1.getName().charAt(0) - o2.getName().charAt(0);
            }
        });
        List ll = new ArrayList();
        int a = 0;
        for(int i = 0; i< t.size(); i++){
            if(i==2 || i ==3||i==4 ||i==5 ||i==6){
                ll.add(l.get(a));
                a++;
            }else{
                ll.add(t.get(i));
            }
        }
        
        t.clear();
        for (int i = 0; i< ll.size(); i++) {
            t.add((Pen) ll.get(i));
        }
    }
    
}
