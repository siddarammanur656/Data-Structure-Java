package Maths;

public class iTHbitofnumber {
    public static void main(String[] args) {
        int num=888888;
        int n=13;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(findIthbit(num,n));
    }
    static int findIthbit(int num, int n){
        return num&(1<<n-1);
    }
}
