/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pro192_exp_task2;

/**
 *
 * @author Admin
 */
public class Lightbulb implements Powered{

    private String bulb;
    private String lightColour;
    private char socket;
    private double volts, watts;

    public Lightbulb(String bulb, String lightColour, char socket, double volts, double watts) {
        this.bulb = bulb;
        this.lightColour = lightColour;
        this.socket = socket;
        this.volts = volts;
        this.watts = watts;
    }

    public String getBulb() {
        return bulb;
    }

    public String getLightColour() {
        return lightColour;
    }

    public char getSocket() {
        return socket;
    }

    public double getVolts() {
        return volts;
    }

    public double getWatts() {
        return watts;
    }

    @Override
    public String toString() {
        return "Lightbulb{" + "bulb=" + bulb + ", lightColour=" + lightColour + ", socket=" + socket + ", volts=" + volts + ", watts=" + watts + '}';
    }
    
    
    @Override
    public double Volts() {
        return volts;
    }

    @Override
    public double Watts() {
        return watts;
    }
    
}
