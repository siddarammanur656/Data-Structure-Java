package first.java;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num=in.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
            int digits=rem*rem*rem;
            sum+=digits;
            num/=10;
        }
        System.out.println(sum);
    }
}
