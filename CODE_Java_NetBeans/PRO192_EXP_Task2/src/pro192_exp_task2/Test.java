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
public class Test {
    public static void main(String[] args) {
        Powered[] pow = new Powered[5];
        pow[0] = new Lightbulb("bóng 1", "sáng trắng", 'S', 240, 100);
        pow[1] = new Lightbulb("bóng 2", "sáng vàng", 'B', 240, 300);
        pow[2] = new Lightbulb("bóng 3", "sáng trắng", 'S', 240, 400);
        pow[3] = new Lightbulb("bóng 4", "sáng vàng", 'B', 220, 500);
        pow[4] = new Lightbulb("bóng 5", "sáng trắng", 'S', 220, 600);
        
        int a = 0;
        for (Powered powered : pow) {
            if(((Lightbulb)powered).Volts() == 240){
                a++;
                System.out.println(powered.toString());  
            }
        }
        System.out.println("Số lượng bóng dùng 240V: "+ a);
        
        
        int x = 0, y = 0;
        for (Powered powered : pow) {
            if(((Lightbulb)powered).getSocket() == 'S'){
                x++;
            }else
                y++;
        }
        System.out.println("Screw: "+ x+", Bayonet: "+y);
    }
}
