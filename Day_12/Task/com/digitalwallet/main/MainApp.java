package com.digitalwallet.main;

import java.util.Scanner;
import com.digitalwallet.model.User;
import com.digitalwallet.service.WalletService;
import com.digitalwallet.exception.InsufficientFundsException;

public class MainApp {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        WalletService service=new WalletService();

        System.out.println("Enter user id: ");
        int id=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter user name: ");
        String name=sc.nextLine();
        System.out.println("Enter initial balance: ");
        double balance=sc.nextDouble();

        User user=new User(id, name, balance);
        user.display();

        int choice=0;
        while(choice!=4){
            System.out.println("\n1. Add Money");
            System.out.println("2. Send Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Show Transactions");
            System.out.println("5. Exit");
            System.out.println("Enter choice: ");
            choice=sc.nextInt();

            if(choice==1){
                System.out.println("Enter amount to add: ");
                double amount=sc.nextDouble();
                service.addMoney(user, amount);
            }else if(choice==2){
                System.out.println("Enter amount to send: ");
                double amount=sc.nextDouble();
                try{
                    service.sendMoney(user, amount);
                }catch(InsufficientFundsException e){
                    System.out.println("Error: "+e.getMessage());
                }
            }else if(choice==3){
                service.checkBalance(user);
            }else if(choice==4){
                service.showTransactions(user);
            }else if(choice==5){
                System.out.println("Exiting...");
                break;
            }else{
                System.out.println("Invalid choice!");
            }
        }
        sc.close();
    }
}