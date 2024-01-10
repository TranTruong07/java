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
public class Soil implements Sellable, HasMass{
    private String description;
    private double pricePerCubicMetre;
    private double purchasedVolume;
    private double millimetres;

    public Soil(String description, double pricePerCubicMetre, double purchasedVolume, double millimetres) {
        this.description = description;
        this.pricePerCubicMetre = pricePerCubicMetre;
        this.purchasedVolume = purchasedVolume;
        this.millimetres = millimetres;
    }

    @Override
    public String toString() {
        return "Soil{" + "description=" + description + ", pricePerCubicMetre=" + pricePerCubicMetre + ", purchasedVolume=" + purchasedVolume + ", millimetres=" + millimetres + '}';
    }

    @Override
    public double getPrice() {
        return purchasedVolume * pricePerCubicMetre;
    }

    @Override
    public String getReceiptLine() {
        String part1 = String.format(" %.2f %s (%.2fmm) ",purchasedVolume , description, millimetres);
        return String.format("%-41.41s $ %7.2f", part1, getPrice());
    }

    @Override
    public double getVolume() {
        return purchasedVolume;
    }
    
    
}
