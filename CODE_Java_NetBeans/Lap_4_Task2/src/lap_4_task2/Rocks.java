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
public class Rocks implements Sellable, HasMass{
    private String description;
    private double pricePerCubicMetre;
    private double purchasedVolume;

    public Rocks(String description, double pricePerCubicMetre, double purchasedVolume) {
        this.description = description;
        this.pricePerCubicMetre = pricePerCubicMetre;
        this.purchasedVolume = purchasedVolume;
    }

    @Override
    public String toString() {
        return "Rocks{" + "description=" + description + ", pricePerCubicMetre=" + pricePerCubicMetre + ", purchasedVolume=" + purchasedVolume + '}';
    }
    
    @Override
    public double getPrice() {
        return purchasedVolume *pricePerCubicMetre;
    }

    @Override
    public String getReceiptLine() {
        String part1 = String.format(" %.2f %s ",purchasedVolume , description);
        return String.format("%-41.41s $ %7.2f", part1, getPrice());
    }

    @Override
    public double getVolume() {
        return purchasedVolume;
    }
    
}
