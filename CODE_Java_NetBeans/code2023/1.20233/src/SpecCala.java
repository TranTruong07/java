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

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+" # " + color;
    }
    
    public void setData(){
        String[] arrs = super.getOwner().split(" ");
        for(int i = 0; i< arrs.length; i++){
            String s = arrs[i].substring(0, 1).toUpperCase()+ arrs[i].substring(1).toLowerCase();
            arrs[i] = s;
        }
        String news = "";
        for (String arr : arrs) {
            news += arr+" ";
        }
        super.setOwner(news.trim());
    }
    public int getValue(){
        if(color % 2 == 0){
            return super.getPrice()+1;
        }else{
            return super.getPrice()+2;
        }
    }
}
