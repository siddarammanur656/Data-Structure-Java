package functions;

import java.util.Scanner;
 
/*
 * Java Program to find largest and smallest of three numbers
 */
public class Largest_Smallest {
 
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first number :");
        int first = scanner.nextInt();
 
        System.out.println("Please enter second number :");
        int second = scanner.nextInt();
 
        System.out.println("Please enter third number :");
        int third = scanner.nextInt();
 
        int largest = largest(first, second, third);
        int smallest = smallest(first, second, third);

    }

    public static int largest(int first, int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
        }
 
        if (third > max) {
            max = third;
        }
 
        return max;
    }

    public static int smallest(int first, int second, int third) {
        int min = first;
        if (second < min) {
            min = second;
        }
 
        if (third < min) {
            min = third;
        }
 
        return min;
    }
}
 