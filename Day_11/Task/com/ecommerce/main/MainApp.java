package com.ecommerce.main;
import java.util.*;
import com.ecommerce.service.CarService;
import com.ecommerce.model.Product;
import com.ecommerce.util.DiscountUtil;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of products : ");
        int n=sc.nextInt();
        CarService cart=new CarService();
        for(int i = 0; i < n; i++) {
        System.out.println("Enter product id: ");
        int id = sc.nextInt();
        System.out.println("Enter product name: ");
        String name = sc.next();
        System.out.println("Enter product price: ");
        int price = sc.nextInt();
        Product p = new Product(id, name, DiscountUtil.applyDiscount(price));
        cart.addProduct(p);
}
        cart.showCart();
        int totalAmount=cart.calculateTotal();
        System.out.println("Total amount: $"+totalAmount);
        sc.close();
    }
}