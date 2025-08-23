package first.java;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();

        if(n%2==1){
            System.out.println(n +" is ODD Number");
        }else{
            System.out.println(n +" is Even Number");
        }
    }
}
