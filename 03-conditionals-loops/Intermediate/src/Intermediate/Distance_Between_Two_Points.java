package Intermediate;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Distance_Between_Two_Points {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.print("Enter x1: ");
        int x1=in.nextInt();
        System.out.print("Enter x2: ");
        int x2=in.nextInt();
        System.out.print("Enter y1: ");
        int y1=in.nextInt();
        System.out.print("Enter y2: ");
        int y2=in.nextInt();

        Distance(x1,y1,x2,y2);
    }
    static void Distance(int x1,int y1,int x2, int y2){
        double distance=Math.sqrt(Math.pow(x2-x1,2)+(Math.pow(y2-y1,2)));
        System.out.println("Distance Between Two Points: "+distance);
    }
}
