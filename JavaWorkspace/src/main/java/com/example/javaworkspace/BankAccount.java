package com.example.javaworkspace;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        // this class might be an overkill, sorry, im just onto something :P
        Scanner sc = new Scanner(System.in);
        String ownerName = "Aviv";
        double balance = 0;
        System.out.println("Hi " + ownerName + ". Balance options: view, deposit, withdraw");
        String option;
        double amount;
        while (true) {
            option = sc.next();
            if (option.equals("view")) {
                viewBalance(balance);
            }
            else if (option.equals("deposit")) {
                System.out.println("how much to deposit?");
                amount = sc.nextDouble();
                balance = deposit(balance, amount);
            }
            else if (option.equals("withdraw")) {
                System.out.println("how much to withdraw?");
                amount = sc.nextDouble();
                balance = withdraw(balance, amount);
            }
            else {
                System.out.println("invalid option, try again");
            }
        }
    }
    public static void viewBalance(double balance) {
        System.out.println("your balance: " + balance + " shekels");
    }
    public static double deposit(double balance, double dep) {
        if (dep < 100) {
            System.out.println("operation cancelled, minimum deposit amount is 100 shekels");
        }
        else if (balance + dep > 100000) {
            System.out.println("operation cancelled, your account's balance has a limit of 100000 shekels");
        }
        else if (dep < 10000) {
            System.out.println("operation complete");
            return balance + dep;
        }
        else {
            System.out.println("operation cancelled, sussy transaction");
        }
        return balance;
    }
    public static double withdraw(double balance, double money) {
        if (money < 20) {
            System.out.println("operation cancelled, minimum withdraw amount is 20 shekels");
        }
        else if (balance - money >= 0) {
            System.out.println("operation complete");
            return balance - money;
        }
        else {
            System.out.println("operation cancelled, not enough money");
        }
        return balance;
    }
}