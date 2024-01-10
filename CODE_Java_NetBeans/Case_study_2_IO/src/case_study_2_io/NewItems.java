/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package case_study_2_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class NewItems extends Vector<Item>{
    Scanner sc = new Scanner(System.in);
    Vector<String> storedCodes = new Vector<String>();// stored code in file
    public NewItems(){
        super();
    }
    public void loadStoredCodes(String fName){
        if(storedCodes.size()>0) storedCodes.clear();
        try {
            File f = new File(fName);
            if(!f.exists()) return;
            FileReader fr = new FileReader(f);// read
            BufferedReader bf = new BufferedReader(fr);// readLine
            String code, name, priceStr;
            while((code = bf.readLine())!= null && 
                  (name = bf.readLine())!= null &&
                  (priceStr = bf.readLine())!= null)
                storedCodes.add(code);
            bf.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    private boolean valid (String aCode) {
        //check it in stored codes
        int i;
        for(i = 0; i< storedCodes.size(); i++)
            if(aCode.equals(storedCodes.get(i))) return false;
        //check it in new-item list
        for(i = 0; i< this.size(); i++){
            if(aCode.equals(this.get(i).getCode())) return false;
        }
        return true;
    }
    // find an item code in new-item list
    private int find(String aCode){
        for(int i = 0; i< this.size(); i++){
            if(this.get(i).getCode().equals(aCode))
                return i;
        }
        return -1;
    }
    // Append new-item list to a text file
    public void appendToFile(String fName){
        if(this.size() == 0){
            System.out.println("Empty list");
            return;
        }
        try {
            boolean append = true;
            File f = new File(fName);
            FileWriter fw = new FileWriter(f, append);
            PrintWriter pw = new PrintWriter(fw);
            for (Item x : this) {
                pw.println(x.getCode());
                pw.println(x.getName());
                pw.println(x.getPrice());
                pw.flush();
            }
            pw.close(); fw.close();
            this.loadStoredCodes(fName);
            this.clear();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // add new item
    public void addNewItem() {
        String newCode, newName; int price;
        boolean duplicated = false, matched = true;
        System.out.println("Enter New Item Details");
        do {     
            System.out.print("  code(format I000): ");
            newCode = sc.nextLine().toUpperCase();
            duplicated = !valid(newCode);
            matched = newCode.matches("^I\\d{3}$");
            if(duplicated) System.out.println(" The code is duplicated.");
            if(!matched) System.out.println(" The code: I and 3 digits.");
        } while (duplicated || (!matched));
        
        System.out.print("  name: ");
        newName = sc.nextLine().toUpperCase();
        System.out.print("  price: ");
        price = Integer.parseInt(sc.nextLine());
        this.add(new Item(newCode, newName, price));
        System.out.println("New Item has been added.");
    }
    
    public void removeItem(){
        String code;
        System.out.println("Enter the code of remove Item: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if(pos<0){
            System.out.println("This code does not exist.");
        }else{
            this.remove(pos);
            System.out.println("The employee "+ code + " has been removed");
        }
    }
    
    public void updatedItem(){
        String code;
        System.out.println("Enter the code of Item: ");
        code = sc.nextLine().toUpperCase();
        int pos = find(code);
        if(pos < 0){
            System.out.println("This code does not exist.");
        }else {
            int oldPrice = this.get(pos).getPrice();
            int newPrice;
            do {                
                System.out.println("Old Price: "+ oldPrice+ ", new Price: ");
                newPrice = Integer.parseInt(sc.nextLine());
            } while (newPrice < oldPrice);
            this.get(pos).setPrice(newPrice);
            System.out.println("The Item "+ code + " has been updated.");
        }
    }
    
    // print out the list 
    public void print(){
        if (this.isEmpty()){
            System.out.println("Empty list.");
            return;
        }
    //    Collections.sort(this);
        System.out.println("\n ITEM LIST");
        System.out.println("------------------------------");
        for (Item x : this) {
            x.print();
        }
    }
}
