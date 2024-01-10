/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Book implements Serializable{
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
    public void print(){
        System.out.println(title +"         "+price);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}
