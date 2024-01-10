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
public class RefrigeratedUnit extends RailroadCar{
    private double goodsWeight, coolantWeight; 

    public RefrigeratedUnit(String id, double tareWeight, double goodsWeight, double coolantWeight) {
        super(id, tareWeight);
        this.goodsWeight = goodsWeight;
        this.coolantWeight = coolantWeight;
    }
    @Override
    public double calculateTotalWeight() {
        return goodsWeight + super.getTareWeight()+coolantWeight;
    }
    @Override
    public String getDetails() {
        return super.getDetails() + ", " + "goodsWeight : " + goodsWeight+"," + "coolantWeight : " + coolantWeight;
    }

    @Override
    public String toString() {
        return "RefrigeratedUnit{" + "goodsWeight=" + goodsWeight + ", coolantWeight=" + coolantWeight + '}';
    }
    
}
