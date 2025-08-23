package functions;

import java.util.Scanner;

public class PrimeInterval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lower = in.nextInt();

        System.out.print("Enter the upper bound: ");
        int upper = in.nextInt();

        System.out.println("Prime numbers between " + lower + " and " + upper + " are:");

        for (int num = lower; num <= upper; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Helper method to check if a number is prime
    static boolean isPrime(int n) {

        if (n <= 1) return false;

        if (n == 2) return true;

        if (n % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }

        return true;
    }
}