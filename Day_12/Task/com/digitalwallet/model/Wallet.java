package com.digitalwallet.model;

import java.util.ArrayList;

public class Wallet {
    private double balance;
    private ArrayList<Transaction> transactions=new ArrayList<>();

    public Wallet(double balance){
        this.balance=balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void addBalance(double amount){
        this.balance+=amount;
    }

    public void deductBalance(double amount){
        this.balance-=amount;
    }

    public void addTransaction(Transaction t){
        transactions.add(t);
    }

    public void showTransactions(){
        if(transactions.isEmpty()){
            System.out.println("No transactions found.");
            return;
        }
        for(Transaction t:transactions){
            t.display();
        }
    }

    public void display(){
        System.out.println("Balance: ₹"+balance);
    }
}