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
public class RailroadCar {
    private String id;
    private double  tareWeight;

    public RailroadCar(String id, double tareWeight) {
        this.id = id;
        this.tareWeight = tareWeight;
    }

    public double getTareWeight() {
        return tareWeight;
    }
    
    public double calculateTotalWeight() {
        return tareWeight + 105;
    }
    
    public String getDetails() {
        return "id : "+ id + ", " + "tareWeight : " + tareWeight;
    }

    @Override
    public String toString() {
        return "RailroadCar{" + "id=" + id + ", tareWeight=" + tareWeight + '}';
    }

    public String getId() {
        return id;
    }
    
    
    
}
