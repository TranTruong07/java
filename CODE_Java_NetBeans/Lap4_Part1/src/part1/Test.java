/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package part1;

/**
 *
 * @author Admin
 */
public class Test {
    public static void main(String[] args) {
        ForSale[] fs = new ForSale[7];
        fs[0] = new CarForSale("01", "ABC");
        fs[1] = new ComputerForSale("02", 'M');
        fs[2] = new DogForSale("small", 'B');
        fs[3] = new DogForSale("small", 'S');
        fs[4] = new DogForSale("big", 'M');
        fs[5] = new DogForSale("medium", 'B');                               
        fs[6] = new CarForSale("02", "DEF");
        
        // all
        for (ForSale f : fs) {
            System.out.println(f);
        }
        System.out.println("");
        // Car
        for (ForSale f : fs) {
            if(f.getPrice() == 5000){
                System.out.println(f);
            }
        }
        System.out.println("");
        int i = 0;
        for (ForSale f : fs) {
            if(f instanceof DogForSale){
                if(((DogForSale)f).getName() == "small"){
                    i++;
                }
            }
        }
        System.out.println("Small Dog: "+i);
        
        
    }
}
