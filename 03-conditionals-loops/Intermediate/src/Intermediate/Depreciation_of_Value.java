package Intermediate;

import java.util.Scanner;

public class Depreciation_of_Value {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Initial Value: ");
        int initial_value=in.nextInt();

        System.out.print("Enter the Rate: ");
        int rate=in.nextInt();

        System.out.print("Enter the Number of Years: ");
        int years=in.nextInt();

        double Depreciation_of_value=initial_value*Math.pow((double) (100 - rate) /100,years);
        System.out.println("Depreciation of Value: "+Depreciation_of_value);
//        double value = in.nextDouble();
//        double rate = in.nextDouble(); // in percent
//        int time = in.nextInt();
//        double depreciatedValue = value * Math.pow((1 - rate / 100), time);
//        System.out.println(depreciatedValue);
    }
}
