package first.java;

import java.util.Scanner;

public class Calcullator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the two numbers: ");
        int a= in.nextInt();
        int b=in.nextInt();

        System.out.print("Enter the Operator: ");
        char  op=in.next().trim().charAt(0);

        double ans=0;

        if (op =='+') {
            ans=a+b;
        }
        else if (op =='-') {
            ans=a-b;
        }
        else if (op =='*') {
            ans=a*b;
        }
        else if (op == '/') {
            if (b != 0) {
                ans = a/b;
            } else {
                System.out.println("The b value should not be Zero");
                return;
            }
        }
        else if (op =='%') {
            ans=a%b;
        }
        else{
            System.out.println("Invalid Oprerator!!");
        }

        System.out.println(ans);
    }
}
