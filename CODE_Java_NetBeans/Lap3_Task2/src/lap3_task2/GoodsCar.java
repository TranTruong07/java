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
public class GoodsCar extends RailroadCar{
    private double goodsWeight;

    public GoodsCar(String id, double tareWeight, double goodsWeight) {
        super(id, tareWeight);
        this.goodsWeight = goodsWeight;
    }
    
    @Override
    public double calculateTotalWeight() {
        return goodsWeight + super.getTareWeight();
    }
    
    @Override
    public String getDetails() {
        return super.getDetails() + ", " + "goodsWeight : " + goodsWeight;
    }
    
    public String getName(){
        return super.getId();
    }
}
