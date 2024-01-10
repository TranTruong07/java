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
public class DogForSale extends Dog implements ForSale{

    public DogForSale(String name, char size) {
        super(name, size);
    }

    @Override
    public double getPrice() {
        return 1000;
    }
    
}
