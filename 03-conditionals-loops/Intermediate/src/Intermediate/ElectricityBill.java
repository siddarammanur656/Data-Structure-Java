package Intermediate;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double units=in.nextInt();
        double bill=0;
        
        if(units<=100){
            bill=100*1.5;
        } else if (units<=200) {
            bill=(100*1.5)+(units-100)*2.5;
        }else{
            bill=(100*1.5)+(200*2.5)+(units-200)*3.5;
        }
        System.out.println("Total Bill: ₹" + bill);
    }
}
