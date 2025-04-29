package Maths;

public class Rightmostbit {
    public static void main(String[] args) {
        int n=18;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(FindRightmostbit(n));
    }
    static int FindRightmostbit(int n){
        return n&(-n);
    }
}
