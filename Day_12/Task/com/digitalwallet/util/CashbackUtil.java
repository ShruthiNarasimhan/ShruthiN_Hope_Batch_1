package com.digitalwallet.util;

public class CashbackUtil {
    public static double applyCashback(double amount){
        if(amount>500){
            return amount*0.10;
        }else if(amount>200){
            return amount*0.05;
        }else{
            return 0;
        }
    }
}