/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iaccount;

/**
 *
 * @author hbminhhh
 */
public class Account implements IAccount{
    private String accNo;
    private double amount;
    private double balance;

    public Account() {
    }

    public Account(String accNo, double amount, double balance) {
        this.accNo = accNo;
        this.amount = amount;
        this.balance = balance;
    }

    

    public String getAccNo() {
        return accNo;
    }
    
        

    @Override
    public void deposit(double amount) {
    }

    @Override
    public void withdraw(double amount) {
        
    }

    @Override
    public double balance() {
       return balance; 
    }

    public double getBalance() {
        return balance;
    }



}
   

