import java.util.Scanner;

public class Gretternum {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the num1: ");
        int n1 = sc.nextInt();
        System.out.println("enter the num2: ");
        int n2=sc.nextInt();


        if (n1>n2){
            System.out.println("number n1:"+n1 + "is gretter than n2");
        }
        else{
            System.out.println("number n2:"+n2 + " is gretter than n1");
        }
    }
}
