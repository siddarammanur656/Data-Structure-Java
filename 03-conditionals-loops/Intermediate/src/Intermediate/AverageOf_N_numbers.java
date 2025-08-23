package Intermediate;

import java.util.Scanner;

public class AverageOf_N_numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();
        int sum=0;
        for (int i = 1; i<=n ; i++) {
            sum +=i;
        }
        double avg=sum/n;
        System.out.println(avg);
    }
}
