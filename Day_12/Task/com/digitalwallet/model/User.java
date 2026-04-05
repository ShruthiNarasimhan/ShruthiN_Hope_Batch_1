package com.digitalwallet.model;

public class User {
    private int id;
    private String name;
    private Wallet wallet;

    public User(int id, String name, double initialBalance){
        this.id=id;
        this.name=name;
        this.wallet=new Wallet(initialBalance);
    }

    public String getName(){
        return this.name;
    }

    public Wallet getWallet(){
        return this.wallet;
    }

    public void display(){
        System.out.println("User ID: "+id+" | Name: "+name);
    }
}