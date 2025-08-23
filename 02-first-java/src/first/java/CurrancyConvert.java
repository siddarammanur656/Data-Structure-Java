package first.java;

import java.util.Scanner;

public class CurrancyConvert {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        System.out.println("Enter Indian Rupees: ");
        int rupees=in.nextInt();

        System.out.println("USD:"+rupees/83);
    }
}
