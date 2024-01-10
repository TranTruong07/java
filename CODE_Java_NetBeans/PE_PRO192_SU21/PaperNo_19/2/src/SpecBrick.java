/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 2k3so
 */
public class SpecBrick extends Brick{
    private int color;

    public SpecBrick() {
    }

    public SpecBrick(String place, int price,int color) {
        super(place, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + color;
    }
    
    public void setData(){
        String c = "";
        c += super.getPlace().substring(0, 2) + "BCA" + super.getPlace().substring(2);
        super.setPlace(c);
    }
    
    public int getValue(){
        if(this.color > 7){
            return super.getPrice() + 9;
        }
        return super.getPrice() + 6;
    }
    
}
