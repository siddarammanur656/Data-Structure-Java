package Maths;

public class SumofNthrowinPascaltriangle {
    public static void main(String[] args) {
        int n=6;
        System.out.println(sum(n));
    }
    static int sum(int n){
        return (int) Math.pow(2, n-1);
    }
}
