
import iaccount.Account;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Test setDeposit()");
        System.out.println("2. Test getWithdraw()");
        System.out.print("Enter TC(1 or 2):");
        int tc = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the Account Number:");
        String accNo = sc.nextLine();
        if (!accNo.equals("123")) {
            System.out.println("OUTPUT:");
            System.out.println("Wrong account");
            return;
        }
        System.out.print("Enter amount to deposit:");
        double amount = sc.nextDouble();
        Account ac = new Account(accNo,0 ,0);        
        ac.deposit(amount);
        switch (tc) {
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(ac.getBalance());
                break;
            case 2:
                System.out.print("Enter amount to withdraw:");
                amount = sc.nextDouble();
                System.out.println("OUTPUT:");
                if (ac.getBalance() > amount) {
                    ac.withdraw(amount);
                    System.out.println(ac.balance());
                }
                else
                    System.out.println("Withdraw not accepted");
                break;
        }
    }
}
