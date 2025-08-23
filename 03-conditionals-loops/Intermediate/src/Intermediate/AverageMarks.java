package Intermediate;

import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjects = sc.nextInt();
        int total = 0;

        for (int i = 0; i < subjects; i++) {
            total += sc.nextInt();
        }
        System.out.println("Average Marks: " + (total / subjects));
    }
}
