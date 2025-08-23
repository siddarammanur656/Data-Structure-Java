package first.java;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);

        String  str=in.nextLine();

        int start=0;
        int end=str.length()-1;
        boolean ispalibrome=true;

        while(start<end){
            if(str.charAt(start) != str.charAt(end)){
                ispalibrome=false;
                break;
            }
            start++;
            end--;
        }
        if(ispalibrome){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+" is not palindrome");
        }

    }
}
