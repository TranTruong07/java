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
public interface IAccount{
    public void deposit(double amount);
    public void withdraw(double amount);
    public double balance();
}
