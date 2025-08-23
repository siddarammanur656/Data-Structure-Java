package conditionals.loops;

import java.util.Scanner;

public class Sum_All_number_until_user_Enters_Zero {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("Enter input: ");
            int input=in.nextInt();
            if (input==0) {
                // Your code here
                break;
            }
            sum+=input;
        }
        System.out.println("The Sum of all numbers is :"+sum);
    }
}
