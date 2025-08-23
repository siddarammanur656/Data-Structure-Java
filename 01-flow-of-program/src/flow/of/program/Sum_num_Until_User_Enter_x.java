package flow.of.program;

import java.util.Scanner;

public class Sum_num_Until_User_Enter_x {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.print("Enter input: ");
            String input=in.next();
            if (input.equals("X") || input.equals("x")) {
                // Your code here
                break;
            }

            int num=Integer.parseInt(input);
            sum+=num;
        }
        System.out.println("The Sum of all numbers is :"+sum);
    }
}
