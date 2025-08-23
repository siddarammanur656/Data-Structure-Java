package Intermediate;

import java.util.Scanner;

public class FutureInvestment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount = sc.nextDouble();
        double rate = sc.nextDouble();
        int years = sc.nextInt();

        double futureValue = amount * Math.pow(1 + rate / 100, years);
        System.out.println("Future Value: ₹" + futureValue);
    }
}
