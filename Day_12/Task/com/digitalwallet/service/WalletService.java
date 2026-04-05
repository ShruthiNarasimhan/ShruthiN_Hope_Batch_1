package com.digitalwallet.service;

import com.digitalwallet.model.User;
import com.digitalwallet.model.Transaction;
import com.digitalwallet.util.CashbackUtil;
import com.digitalwallet.exception.InsufficientFundsException;

public class WalletService {
    public void addMoney(User user, double amount){
        user.getWallet().addBalance(amount);
        Transaction t=new Transaction("Credit", amount, 0);
        user.getWallet().addTransaction(t);
        System.out.println("₹"+amount+" added successfully.");
    }

    public void sendMoney(User user, double amount) throws InsufficientFundsException {
        if(amount>user.getWallet().getBalance()){
            throw new InsufficientFundsException("Insufficient funds! Current balance: ₹"+user.getWallet().getBalance());
        }
        double cashback=CashbackUtil.applyCashback(amount);
        user.getWallet().deductBalance(amount);
        user.getWallet().addBalance(cashback);
        Transaction t=new Transaction("Debit", amount, cashback);
        user.getWallet().addTransaction(t);
        System.out.println("₹"+amount+" sent successfully. Cashback earned: ₹"+cashback);
    }

    public void checkBalance(User user){
        System.out.println(user.getName()+"'s wallet - ");
        user.getWallet().display();
    }

    public void showTransactions(User user){
        System.out.println(user.getName()+"'s transaction history - ");
        user.getWallet().showTransactions();
    }
}