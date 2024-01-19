/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modle;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class Product implements Comparable<Product>{
    //Id, Name, Location, Price, Expiry date, Date of manufacture, Category, Storekeeper, ReceiptDate
    private SimpleDateFormat date = new SimpleDateFormat("dd/MM/yyyy");
    private String id, name, location, category, storekeeper;
    private double price;
    private Date expiryDate, dateOfManufacture, receiptDate;

    public Product(String id, String name, String location, String category, String storekeeper, double price, Date expiryDate, Date dateOfManufacture, Date receiptDate) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.category = category;
        this.storekeeper = storekeeper;
        this.price = price;
        this.expiryDate = expiryDate;
        this.dateOfManufacture = dateOfManufacture;
        this.receiptDate = receiptDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStorekeeper() {
        return storekeeper;
    }

    public void setStorekeeper(String storekeeper) {
        this.storekeeper = storekeeper;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Date getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(Date dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public Date getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Date receiptDate) {
        this.receiptDate = receiptDate;
    }

    @Override
    public String toString() {
        return id + "\t" + name + "\t" + location + "\t" + category + "\t" + storekeeper + "\t" + price + "\t" +date.format(expiryDate)+ "\t" + date.format(dateOfManufacture) + "\t" + date.format(receiptDate);
    }

    @Override
    public int compareTo(Product o) {
        if (this.getExpiryDate().compareTo(o.getExpiryDate()) != 0) {
                    return this.getExpiryDate().compareTo(o.getExpiryDate());
                } else {
                    return this.getDateOfManufacture().compareTo(o.getDateOfManufacture());
                }
    }

   
}
