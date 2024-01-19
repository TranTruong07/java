/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import modle.Product;

/**
 *
 * @author Admin
 */
public class Manage {

    private Scanner sc = new Scanner(System.in);
    private List<Product> list = new ArrayList<>();
    private HashMap<String, Boolean> hasmap = new HashMap();

    public List<Product> getList() {
        return list;
    }

    public HashMap<String, Boolean> getHasmap() {
        return hasmap;
    }

    public void addStorekeeper(String s) {
        while (true) {
            System.out.println(s);
            String x = sc.nextLine();
            if (hasmap.containsKey(x)) {
                System.out.println("duplicate");
            } else {
                hasmap.put(x, true);
                System.out.println("added");
                break;
            }
        }
    }

    public void addProduct(Product p) {
        list.add(p);
    }

    public void updateProduct(String id1, HashMap<String, Boolean> hasmap) {
        for (Product product : list) {
            if (product.getId().equals(id1)) {
                updateByChosse(product, hasmap);
                System.out.println("has been update");
            }
        }
    }

    public void removeProduct(String id) {
        Iterator<Product> l = list.iterator();
        while (l.hasNext()) {
            Product product = l.next();
            if (product.getId().equals(id)) {
                l.remove();
            }
        }
    }

    private void updateByChosse(Product p, HashMap<String, Boolean> hasmap) {
        do {
            System.out.println("1. Name\n2. Location\n3. Price\n4. Expiry date\n5. Date of manufacture\n6. Category\n7. Storekeeper\n8. ReceiptDate\n9. exit");
            System.out.println("Enter your choice you want update: ");
            int chose = Validation.getInt("Enter 1-9", 9);;
            switch (chose) {
                case 1:
                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();
                    p.setName(name);
                    break;
                case 2:
                    System.out.println("Enter Location: ");
                    String location = sc.nextLine();
                    p.setLocation(location);
                    break;
                case 3:
                    double price = Validation.getDouble("Enter price: ");
                    p.setPrice(price);
                    break;
                case 4:
                    Date expiryDate = Validation.getDate("Enter Expiry date (dd/MM/yyyy): ");
                    p.setExpiryDate(expiryDate);
                    break;
                case 5:
                    Date dateOfManufacture = Validation.getDate("Enter Date of manufacture ((dd/MM/yyyy): ");
                    p.setDateOfManufacture(dateOfManufacture);
                    break;
                case 6:
                    System.out.println("Enter Category: ");
                    String category = sc.nextLine();
                    p.setCategory(category);
                    break;
                case 7:
                    String storekeeper = Validation.getStorekeeper("Enter Storekeeper: ", hasmap);
                    p.setStorekeeper(storekeeper);
                    break;
                case 8:
                    Date receiptDate = Validation.getDate("Enter ReceiptDate (dd/MM/yyyy): ");
                    p.setReceiptDate(receiptDate);
                    break;
                case 9:
                    return;
                default:
                    return;
            }
        } while (true);
    }

    public void searchProduct() {
        System.out.println("1. Name(string)\n2. Category(string)\n3. Storekeeper(string)\n4. ReceiptDate(Date)");
        int chose = Validation.getInt("Enter 1-4", 4);
        switch (chose) {
            case 1:
                System.out.println("Enter Name: ");
                String name = sc.nextLine();
                for (Product product : list) {
                    if (product.getName().equals(name)) {
                        System.out.println(product.toString());
                    }
                }
                break;
            case 2:
                System.out.println("Enter Category: ");
                String category = sc.nextLine();
                for (Product product : list) {
                    if (product.getCategory().equals(category)) {
                        System.out.println(product.toString());
                    }
                }
                break;
            case 3:
                System.out.println("Enter Storekeeper: ");
                String storekeeper = sc.nextLine();
                for (Product product : list) {
                    if (product.getStorekeeper().equals(storekeeper)) {
                        System.out.println(product.toString());
                    }
                }
                break;
            case 4:
                Date receiptDate = Validation.getDate("Enter ReceiptDate (dd/MM/yyyy): ");
                for (Product product : list) {
                    if (product.getReceiptDate().compareTo(receiptDate) == 0) {
                        System.out.println(product.toString());
                    }
                }
                break;
        }
    }

    public void sort() {
        System.out.println("Sort product by Expiry date, Date of manufacture");
        Collections.sort(list);

        for (Product product : list) {
            System.out.println(product.toString());
        }
    }

}
