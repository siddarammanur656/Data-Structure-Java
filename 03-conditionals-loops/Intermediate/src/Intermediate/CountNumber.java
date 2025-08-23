package Intermediate;

import java.util.Scanner;

public class CountNumber {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int num=in.nextInt();
        System.out.println("Enter the single digit number want to count: ");
        int searchcount=in.nextInt();

        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==searchcount){
                count++;
            }
            num /=10;
        }
        System.out.println(count);
    }
}
