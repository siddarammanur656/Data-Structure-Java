package RecursionEasyproblems;

public class ReverseNum {
    public static void main(String[] args) {
        int n=22122;
        System.out.println(Reversenum(n));
        if(n==Reversenum(n)){
            System.out.println("true");;
        }else {
            System.out.println("false");
        }
    }
    static int Reversenum(int n){
        int digits=(int)Math.log10(n)+1;
        return helper(n,digits);
    }

    private static int helper(int n, int digits) {
        if(n%10==n){
            return n;
        }
        int rem=n%10;
        return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
    }

}
