package Intermediate;

import java.util.Scanner;

public class NumberSumCategorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, negSum = 0, evenSum = 0, oddSum = 0;

        while ((num = sc.nextInt()) != 0) {
            if (num < 0)
                negSum += num;
            else if (num % 2 == 0)
                evenSum += num;
            else
                oddSum += num;
        }

        System.out.println("Negative Sum: " + negSum);
        System.out.println("Positive Even Sum: " + evenSum);
        System.out.println("Positive Odd Sum: " + oddSum);
    }
}
