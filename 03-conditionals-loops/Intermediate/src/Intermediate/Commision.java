package Intermediate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Commision {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter the Sales:");
        int sales=in.nextInt();
        System.out.println("Enter the Rate: ");
        int rate=in.nextInt();

        double commision=(sales*rate)/100;
        System.out.print("Commision: "+commision);
    }
}
