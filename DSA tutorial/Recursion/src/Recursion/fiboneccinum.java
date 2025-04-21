package Recursion;

public class fiboneccinum {
    public static void main(String[] args) {
        int n=3;
        System.out.println(fibonum(n));
    }
    static int fibonum(int n){
        if (n<2){
            return n;
        }
        return fibonum(n-1)+fibonum(n-2);
    }
}
