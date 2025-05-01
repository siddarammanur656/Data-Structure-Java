package Maths;

public class Happy_Number {
    public static void main(String[] args) {
        int n=2;
        System.out.println(isHappy(n));
    }
    static boolean isHappy(int n) {
        int slow=n;
        int fast=SumOfSqureofEachdigit(n);
        while(fast!=1 && slow!=fast){
            slow=SumOfSqureofEachdigit(slow);
            fast=SumOfSqureofEachdigit(SumOfSqureofEachdigit(fast));
        }
        return fast==1;
    }
    static int SumOfSqureofEachdigit(int n){
        int sum=0;
        while (n>0){
            int digit=n%10;
            sum+=digit*digit;
            n=n/10;
        }
        return sum;
    }
}