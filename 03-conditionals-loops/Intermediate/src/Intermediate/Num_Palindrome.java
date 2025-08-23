package Intermediate;

import java.util.Scanner;

public class Num_Palindrome {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        int num=12654658;

        int Original_num=num;
        int Reverse=0;

        while(num>0){
            int rem=num%10;
            Reverse=Reverse*10 + rem;
            num /=10;
        }

        System.out.println(Reverse);

        if(Original_num==Reverse){
            System.out.println("Number is Palindrome");
        }else {
            System.out.println("Number is not Palindrome");
        }
    }
}
