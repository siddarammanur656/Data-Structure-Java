package Maths;

public class NumberofDigitsinBaseb {
    public static void main(String[] args) {
        int n=1000000;
        int b=2;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(numofdigits(n,b));
    }
    static int numofdigits(int n,int b){
        int ans=(int)(Math.log(n)/Math.log(b))+1;
        return ans;
    }
}
