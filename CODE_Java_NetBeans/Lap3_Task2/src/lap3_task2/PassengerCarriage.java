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
public class PassengerCarriage extends RailroadCar{
    private int numberOfPassenger;

    public PassengerCarriage(String id, double tareWeight, int numberOfPassenger) {
        super(id, tareWeight);
        this.numberOfPassenger = numberOfPassenger;
    }
    @Override
    public double calculateTotalWeight() {
        return (numberOfPassenger * 105)+super.getTareWeight();
    }
    
    @Override
    public String getDetails() {
        return super.getDetails() + ", " + "numberOfPassenger : " + numberOfPassenger;
    }
}
