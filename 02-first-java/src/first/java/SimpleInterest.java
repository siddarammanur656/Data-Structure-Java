package first.java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.print("Enter the Pricipal(P): ");
        int P=in.nextInt();

        System.out.print("Enter the Time(T): ");
        int T=in.nextInt();

        System.out.print("Enter the Rate(R): ");
        int R=in.nextInt();

        int Simple_interest=(P*T*R)/100;
        System.out.println("Simple Interest:"+Simple_interest);
    }
}
