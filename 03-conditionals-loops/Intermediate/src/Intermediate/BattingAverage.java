package Intermediate;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int runs = sc.nextInt();
        int outs = sc.nextInt();
        System.out.println("Batting Average: " + (runs / (double) outs));
    }
}
