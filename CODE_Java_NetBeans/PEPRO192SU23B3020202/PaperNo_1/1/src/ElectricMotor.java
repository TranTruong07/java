/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ElectricMotor {
    private String name;
    private int voltage;
    private int current;

    public ElectricMotor() {
    }

    public ElectricMotor(String name, int voltage, int current) {
        this.name = name;
        this.voltage = voltage;
        this.current = current;
    }

    public String getName() {
        return name.toUpperCase();
    }
    public int getPower(){
        return voltage*current;
    }
    public void setVoltage(int volt){
        if(volt>110 && volt < 220){
            this.voltage = volt;
        }else{
            System.out.println("Invalid value");
        }
    }

    public void setCurrent(int current) {
        if(current>0){
            this.current = current;
        }else{
            System.out.println("Invalid value");
        }
    }
    
}
