package Maths;

public class SetBit {
    public static void main(String[] args) {
        int n=7;
        System.out.println(setbits(n));
    }
    static int setbits(int n){
        int count=0;
        while(n>0){
            count++;
            n=(n&(n-1));
        }
        return count;
    }
}
