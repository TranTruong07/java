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
public class CarForSale extends Car implements ForSale{
    
    public CarForSale(String regNr, String make) {
        super(regNr, make);
    }

    @Override
    public double getPrice() {
        return 5000;
    }
    
}
