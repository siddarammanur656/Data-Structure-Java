package RecursionEasyproblems;

public class CoutZerosinNum {
    public static void main(String[] args) {
        int n=30000402;
        System.out.println(Count(n));
    }
    static int Count(int  n){
        return Helper(n,0);
    }

    private static int Helper(int n, int c) {
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return Helper(n/10,c+1);
        }else {
            return Helper(n/10,c);
        }
    }
}
