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
public class Item implements Sellable{
    private String barcode;
    private String description;
    private double unitPrice;

    public Item(String barcode, String description, double unitPrice) {
        this.barcode = barcode;
        this.description = description;
        this.unitPrice = unitPrice;
    }

    public String getBarcode() {
        return barcode;
    }

    public String getDescription() {
        return description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    @Override
    public String toString() {
        return "Item{" + "barcode=" + barcode + ", description=" + description + ", unitPrice=" + unitPrice + '}';
    }
    
    
   

    @Override
    public String getReceiptLine() {
        return String.format("%13.13s: %-26.26s $%7.2f", barcode, description, unitPrice);
    }

    @Override
    public double getPrice() {
        return unitPrice;
    }
    
}
