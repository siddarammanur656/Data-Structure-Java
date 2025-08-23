package conditionals.loops;

import java.util.Scanner;

public class Print_Largest_num_from_All_until_User_Enters_Zero {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int Largest=0;
        while(true){
            System.out.print("Enter input: ");
            int input=in.nextInt();
            if (input==0) {
                // Your code here
                break;
            }
            if(input>Largest){
                Largest=input;
            }
        }
        System.out.println("The Sum of all numbers is :"+Largest);
    }
}
