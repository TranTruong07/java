/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2k3so
 */
public class SpecCar extends Car{
    private int type;

    public SpecCar() {
    }
    
    public SpecCar(String maker, int price,int type) {
        super(maker, price);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + type;
    }
    
    public void setData(){
        int newPrice = 0;
        String c = "";
        c = "XZ" + getMaker().substring(0);
        newPrice += getPrice() + 20;
        setMaker(c);
        setPrice(newPrice);
    }
    
    public int getValue(){
        int inc = 0;
        if(this.type < 7){
            inc += 10;
        }else{
            inc += 15;
        }
        return super.getPrice() + inc;
    }
}
