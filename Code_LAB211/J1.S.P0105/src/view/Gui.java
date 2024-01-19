/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.Manage;
import controller.Validation;
import java.util.Date;
import java.util.Scanner;
import modle.Product;

/**
 *
 * @author Admin
 */
public class Gui {
    public static void display(){
        Manage m = new Manage();
        Scanner sc = new Scanner(System.in);
        do {            
            showMenu();
            int chose = Validation.getInt("Enter 1-7", 7);
            switch(chose){
                case 1:
                    m.addStorekeeper("Enter Storekeeper: ");
                    break;
                case 2:
                    if(m.getHasmap().isEmpty()){
                        System.out.println("dont't have Storekeeper can't not add Product");
                        break;
                    }
                    //Id, Name, Location, Price, Expiry date, Date of manufacture, Category, Storekeeper, ReceiptDate
                    String id = Validation.getId("Enter id: ", 1, m.getList());
                    System.out.println("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.println("Enter Location: ");
                    String location = sc.nextLine();
                    System.out.println("Enter Category: ");
                    String category = sc.nextLine();
                    String storekeeper = Validation.getStorekeeper("Enter Storekeeper: ", m.getHasmap());
                    Date expiryDate = Validation.getDate("Enter Expiry date (dd/MM/yyyy): ");
                    Date dateOfManufacture = Validation.getDate("Enter Date of manufacture (dd/MM/yyyy): ");
                    Date receiptDate = Validation.getDate("Enter ReceiptDate (dd/MM/yyyy): ");
                    double price = Validation.getDouble("Enter price: ");
                    Product p = new Product(id, name, location, category, storekeeper, price, expiryDate, dateOfManufacture, receiptDate);
                    m.addProduct(p);
                    break;
                case 3:
                    if(m.getList().isEmpty()){
                        System.out.println("List Product is empty.");
                        break;
                    }
                    String id1 = Validation.getId("Enter id: ", 2, m.getList());
                    m.updateProduct(id1, m.getHasmap());
                    break;
                case 4:
                    if(m.getList().isEmpty()){
                        System.out.println("List Product is empty.");
                        break;
                    }
                    m.searchProduct();
                    break;
                case 5:
                    if(m.getList().isEmpty()){
                        System.out.println("List Product is empty.");
                        break;
                    }
                    m.sort();
                    break;
                case 6:
                    if(m.getList().isEmpty()){
                        System.out.println("The list empty!");
                        break;
                    }
                    m.removeProduct(Validation.getId("Enter id: ", 2, m.getList()));
                    break;
                case 7:
                    return;
            }
        } while (true);
    }
    
    

    private static void showMenu() {
        System.out.println("1. Add Storekeeper\n"
                + "2. Add product\n"
                + "3. Update product\n"
                + "4. Search product by Name, Category, Storekeeper, ReceiptDate\n"
                + "5. Sort product by Expiry date, Date of manufacture\n"
                + "6. Remove by id\n"
                + "7. Exit");
    }
}
