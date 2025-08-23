package Intermediate;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        double base = sc.nextDouble();
        System.out.print("Enter the Exponent: ");
        int exponent = sc.nextInt();
        System.out.println("Result: " + Math.pow(base, exponent));
    }
}
