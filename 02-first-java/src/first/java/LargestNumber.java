package first.java;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the Three numbers: ");
        int  a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

//        int max=a;
//        if(b>max){
//            max=b;
//        }
//        if(c>max){
//            max=c;
//        }
//
//        System.out.println("Largest number is "+max);
//----------------------------------------------------------------------
//        int max=Math.max(a,b);
//        System.out.println(Math.max(c,max));
//----------------------------------------------------------------------
        int max=0;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        if(c>max){
            max=c;
        }

        System.out.println(max);
    }
}
