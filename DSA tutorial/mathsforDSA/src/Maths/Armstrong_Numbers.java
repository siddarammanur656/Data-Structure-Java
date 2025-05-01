package Maths;

public class Armstrong_Numbers {
    public static void main(String[] args) {
        int n=153;
        System.out.println(armstrongNumber(n));
    }
    static boolean armstrongNumber(int n) {
        if(n==SumCubeEachdigit(n)){
            return true;
        }else {
            return false;
        }
    }
    static int SumCubeEachdigit(int n){
        int sum=0;
        while (n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        return sum;
    }
}