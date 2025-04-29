package Maths;

public class SetThe_Ithbit {
    public static void main(String[] args) {
        int num=10;
        int n=2;
        System.out.println("User inputs are: ");
        System.out.println(Integer.toBinaryString(num));
        System.out.println(n);
        //for set ith bit
        System.out.println("for set ith bit :");
        System.out.println(Integer.toBinaryString(SetIbit(num,n)));
        System.out.println(SetIbit(num,n));
        //for reset ith bit
        System.out.println("for Reset ith bit :");
        System.out.println(Integer.toBinaryString(ResetIbit(num,n)));
        System.out.println(ResetIbit(num,n));
    }
    static int SetIbit(int num, int n){
        return num |(1<<n-1);
    }
    static int ResetIbit(int num, int n){
        return num &~(1<<n-1);
    }

}
