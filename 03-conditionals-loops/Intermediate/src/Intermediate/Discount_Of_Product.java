package Intermediate;

import java.util.Scanner;

public class Discount_Of_Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Original price of product: ");
        int price=in.nextInt();

        System.out.print("Enter the Discount price of product: ");
        int discount=in.nextInt();

        int finalPrice=price-(price*discount)/100;
        System.out.print("Final Price of Product: "+finalPrice);
    }
}
