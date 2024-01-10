
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
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
public class MyCala implements ICala{

    @Override
    public int f1(List<Cala> t) {
        int count = 0;
        for (Cala cala : t) {
            if(Character.isDigit(cala.getOwner().charAt(1))){
                count++;
            }
        }
        
        
        return count;
    }

    @Override
    public void f2(List<Cala> t) {
        int max = t.get(0).getPrice();
        for (Cala cala : t) {
            if(max < cala.getPrice()){
                max = cala.getPrice();
            }
        }
        
        int count = 0;
        for (Cala cala : t) {
            if(max == cala.getPrice()){
                count++;
            }
            if(count == 2){
                t.remove(cala);
                return;
            }
        }
    }
    
    @Override
    public void f3(List<Cala> t) {
        Collections.sort(t, new Comparator<Cala>() {
            @Override
            public int compare(Cala o1, Cala o2) {
                return Integer.parseInt(o1.getOwner().charAt(1)+"")- Integer.parseInt(o2.getOwner().charAt(1)+"");
            }
        });
    }
    
}
