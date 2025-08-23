package conditionals.loops;

import java.util.Scanner;

public class Fibonacci_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt(); // Number of terms to display

        int a = 0;
        int b = 1;
        int count = 0;

        while (count < num) {
            System.out.print(a + " ");
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
    }
}
