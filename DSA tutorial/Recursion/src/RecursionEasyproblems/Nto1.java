package RecursionEasyproblems;

public class Nto1 {
    public static void main(String[] args) {
        int n=5;
        //funboth(n);
        System.out.println(mul(n));
    }
    //5 to 1
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    //1 to 5
    static void fun2(int n){
        if(n==0){
            return;
        }
        fun2(n-1);
        System.out.println(n);
    }
    //both n to 1 and 1 to n
    static void funboth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        funboth(n - 1);
        System.out.println(n);
    }
    //sum of number
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    //multiplication of n number
    static int mul(int n){
        if(n==0){
            return 1;
        }
        return n*mul(n-1);
    }
}
