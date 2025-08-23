package Intermediate;

import java.util.Scanner;

public class NcrNpr {
    static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        long ncr = factorial(n) / (factorial(r) * factorial(n - r));
        long npr = factorial(n) / factorial(n - r);

        System.out.println("nCr = " + ncr);
        System.out.println("nPr = " + npr);
    }
}
