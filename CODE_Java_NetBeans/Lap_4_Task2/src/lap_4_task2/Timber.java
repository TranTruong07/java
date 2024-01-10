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
public class Timber implements Sellable {

    private String type;
    private double thickness;
    private double width;
    private double length;
    private double pricePerMetre;

    public Timber(String type, double thickness, double width, double length, double pricePerMetre) {
        this.type = type;
        this.thickness = thickness;
        this.width = width;
        this.length = length;
        this.pricePerMetre = pricePerMetre;
    }

    @Override
    public String toString() {
        return "Timber{" + "type=" + type + ", thickness=" + thickness + ", width=" + width + ", length=" + length + ", pricePerMetre=" + pricePerMetre + '}';
    }

    @Override
    public double getPrice() {
        return (this.length * this.pricePerMetre)/100;
    }

    @Override
    public String getReceiptLine() {
        String part1 = String.format(" %.2fm of %.2fcm x %.2fcm %s ",length / 100, thickness, width, type);
        return String.format("%-41.41s $%7.2f ", part1, getPrice());

    }

}
