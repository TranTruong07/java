/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap3_task2;

/**
 *
 * @author Admin
 */
public class Tester1 {
    public static void main(String[] args) {
        RailroadCar[] train = new RailroadCar[5];
        train[0] = new GoodsCar("GoodsCar", 1000, 150);
        train[1] = new GoodsCar("GoodsCar", 1500, 120);
        train[2] = new PassengerCarriage("PassengerCarriage", 2000, 15);
        train[3] = new PassengerCarriage("PassengerCarriage", 2100, 18);
        train[4] = new RefrigeratedUnit("RefrigeratedUnit", 1700, 200, 100);
    
        for(int i = 0; i< 5; i++){
            System.out.println(train[i].getDetails());
        }
        
        for(int i = 0; i< 5; i++){
            System.out.println(" :"+"Total weight: "+ train[i].getId()+": "+ train[i].calculateTotalWeight());
        }
    }
}
