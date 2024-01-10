/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author Admin
 */
public class BookList extends Vector<Book>{
    Scanner sc = new Scanner(System.in);
    public void loadBookFromFile(String fName){
        //Clear current list before load code
        if(this.size()>0) this.clear();
        try {
            File f = new File(fName); // checking the file
            if(!f.exists()) return;
            FileInputStream fi = new FileInputStream(f); // read
            ObjectInputStream fo = new ObjectInputStream(fi);// read object
            Book b;
            while((b = (Book)(fo.readObject())) != null){
                this.add(b);
            }
            fo.close(); fi.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    // Save the list to file
    public void saveToFile(String fName){
        if(this.size() == 0){
            System.out.println("Empty list.");
            return;
        }
        try {
            FileOutputStream f = new FileOutputStream(fName, false);// write
            ObjectOutputStream fo = new ObjectOutputStream(f);// write object
            for (Book b : this) {
                fo.writeObject(b);
            }
            fo.close(); f.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    // add new Item
    public void addNewBook(){
        String title; int price;
        System.out.println("Enter New Book Details: ");
        System.out.print("    title: ");
        title = sc.nextLine().toUpperCase();
        System.out.print("    price: ");
        price = Integer.parseInt(sc.nextLine());
        this.add(new Book(title, price));
        System.out.println("New book has been added.");
    }
    
    // Print out the list
    public void print() {
        if(this.size() == 0){
            System.out.println("Empty list.");
            return;
        }
        System.out.println("\nNew-Item List");
        System.out.println("-------------------------------");
        for (Book x : this) {
            x.print();
        }
    }
}
