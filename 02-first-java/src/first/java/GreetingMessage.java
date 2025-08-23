package first.java;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Name: ");
        String name=in.nextLine();

        System.out.println("Hello "+name+" Welcome to java programming");
    }
}
