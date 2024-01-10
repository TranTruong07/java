
import java.util.Collection;
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
public class MyCar implements ICar{

    @Override
    public int f1(List<Car> list) {
        int average = 0;
        for (Car car : list) {
            average += car.getRate() ;
        }
        average = (average / list.size());
        //Math.ceil(average);
        return average;
    }

    @Override
    public void f2(List<Car> list) {
        int max = list.get(0).getRate();
        int min = list.get(0).getRate();
        int x=0, y=0;
        for(int i = 0; i< list.size(); i++){
            if(max < list.get(i).getRate()){
                max = list.get(i).getRate();
                x = i;
            }
        }
        for(int i = 0; i< list.size(); i++){
            if(min > list.get(i).getRate()){
                min = list.get(i).getRate();
                y = i;
            }
        }
        Collections.swap(list, x, y);
    }

    @Override
    public void f3(List<Car> list) {
        Collections.sort(list, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                if(o1.getMaker().compareTo(o2.getMaker())==0){
                    return o2.getRate()-o1.getRate();
                }
                return o1.getMaker().compareTo(o2.getMaker());
            }
        });
    }
    
}
