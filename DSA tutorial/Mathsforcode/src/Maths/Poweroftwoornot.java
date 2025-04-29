package Maths;

public class Poweroftwoornot {
    public static void main(String[] args) {
        int n=15;
        System.out.println(poweroftwo(n));
    }
    static boolean poweroftwo(int n){
        boolean ans=(n&(n-1))==0;
        return ans;
    }
}
