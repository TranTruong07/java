
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author bravee06
 */
public class MyBox implements IBox {

    @Override
    public void f1(List<Box> list) {
        for(Box b : list){
            String s = ""; 
            s = ""+b.getCode().charAt(0);
            if(s.equals("K")){
                b.setPrice(1.1*b.getPrice());
            }
        }
    }

    @Override
    public int f2(List<Box> list, double d) {
        int count = 0;
        for(Box b : list){
            if(b.getPrice() > d){
                count++;
            }
        }
        return count;
    }

    @Override
    public void f3(List<Box> list) {
        double minPrice = list.get(0).getPrice();
        int j = 0;
        for(int i = 0; i< list.size(); i++){
            if(minPrice>list.get(i).getPrice()){
                minPrice = list.get(i).getPrice();
                j = i;
            }
        }
        if(list.get(j) != list.get(list.size()-1)){
            list.remove(j+1);
        }
    }

    

}
