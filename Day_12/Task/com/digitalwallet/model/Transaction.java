package com.digitalwallet.model;

public class Transaction {
    private String type;
    private double amount;
    private double cashback;

    public Transaction(String type, double amount, double cashback){
        this.type=type;
        this.amount=amount;
        this.cashback=cashback;
    }

    public double getAmount(){
        return this.amount;
    }

    public void display(){
        System.out.println("Type: "+type+" | Amount: ₹"+amount+" | Cashback: ₹"+cashback);
    }
}