package Intermediate;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int ab=a*b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int hcf=a;
        System.out.println("HCF: " + hcf);

        int lcm = ab / hcf;
        System.out.println("LCM: " + lcm);
    }
}
