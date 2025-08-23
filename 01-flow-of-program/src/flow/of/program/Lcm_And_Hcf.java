package flow.of.program;
import java.util.Scanner;

public class Lcm_And_Hcf {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the num1:");
        int a=in.nextInt();
        System.out.print("Enter the num2:");
        int b=in.nextInt();

        int hcf_or_gcd=GCD_or_HCF(a,b);
        //find lcm
        int lcm=(a*b)/hcf_or_gcd;
        System.out.println("GCD or HCF of Given Number is :"+hcf_or_gcd);
        System.out.println("LCM of Given Number is :"+lcm);

    }
    //Find GCD or HCF
    static int GCD_or_HCF(int a,int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
