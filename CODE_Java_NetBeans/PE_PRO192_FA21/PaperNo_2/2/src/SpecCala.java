/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SpecCala extends Cala{
    private int color;

    public SpecCala() {
    }

    public SpecCala(int color) {
        this.color = color;
    }

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }
    public void setData(){
        super.setOwner(super.getOwner().substring(0, 1)+"XX"+ super.getOwner().substring(2));
    }

    @Override
    public String toString() {
        return  super.toString()+", "+color;
    }
    public int getValue(){
        if(this.color % 2 != 0){
            return super.getPrice() + 3;
        }else{
            return super.getPrice() + 7;
        }
    }
}
