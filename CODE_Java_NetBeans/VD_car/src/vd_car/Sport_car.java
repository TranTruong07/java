/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vd_car;

/**
 *
 * @author Admin
 */
public class Sport_car {
    private String colour;
    private int enginePower;
    private boolean convertible;
    private boolean parkingBrake;

    public Sport_car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }


    public String output() {
        return "car[" + "colour:" + colour + ", enginePower:" + enginePower + ", convertible:" + convertible + ", parkingBrake:" + parkingBrake + "]";
    }
    
}
