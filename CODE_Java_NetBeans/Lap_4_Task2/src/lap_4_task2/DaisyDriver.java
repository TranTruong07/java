/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap_4_task2;

/**
 *
 * @author Admin
 */
public class DaisyDriver {

    public static void main(String[] args) {
        Sellable[] goods = new Sellable[9];
        goods[0] = new Item(" 123456789012345 ", " Large Orange Screwdriver ", 55.55);
        goods[1] = new Timber(" Treated Pine ", 4, 18, 325, 11);
        goods[2] = new Item(" 12312312 ", " Self Sealing Stem Bolts ", 0.99);
        goods[3] = new Item(" P100000000000 ", " White & Flattener Corded Drill ", 123);
        goods[4] = new Timber(" Shellacked Window Frame ", 2.8, 2.8, 1200, 4);
        goods[5] = new Rocks("cubic metres of Limestone", 212.5, 2);
        goods[6] = new Rocks("cubic metres of Medium Volcanic Rock", 8.5, 6.6);
        goods[7] = new Soil("cubic metres of Loam", 30, 12.25, 10.00);
        goods[8] = new Soil(" cubic metres of River Sand", 40, 2.20, 2.00);
        double total = 0;
        for (int i = 0; i < goods.length; i++) {
            System.out.println(goods[i].getReceiptLine());
            total += goods[i].getPrice();
        }
        for (int i = 0; i < 50; ++i) {
            System.out.print(" -");
        }
        System.out.println();

        String priceTotal = String.format(" Total $ %.2f ", total);
        System.out.printf(" %50.50s \n ", priceTotal);

        System.out.println("");

        double sum = 0;
        for (Sellable good : goods) {
            if (good instanceof HasMass) {
                sum += ((HasMass) good).getVolume();
            }
        }
        System.out.println("Volume in delivery: " + sum + " cubic metres");
    }
}
