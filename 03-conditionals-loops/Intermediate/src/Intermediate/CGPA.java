package Intermediate;

import java.util.Scanner;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjects = sc.nextInt();
        double total = 0;
        for (int i = 0; i < subjects; i++) {
            total += sc.nextDouble();
        }
        double cgpa = total / subjects;
        System.out.println("CGPA: " + cgpa);
    }
}
