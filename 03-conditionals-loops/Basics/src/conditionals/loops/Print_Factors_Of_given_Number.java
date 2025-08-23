package conditionals.loops;

import java.util.Scanner;

public class Print_Factors_Of_given_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n=in.nextInt();

        if(n==0){
            System.out.println(n);
        }
        int i=1;
        while(i<=n){
           if(n%i==0){
               System.out.print(i+" ");
           }
           i++;
        }
    }
}
