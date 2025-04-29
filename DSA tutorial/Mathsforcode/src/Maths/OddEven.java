package Maths;

public class OddEven {
    public static void main(String[] args) {
        int n=26;
        if(Odd(n)){
            System.out.println("the given number is odd");
        }else {
            System.out.println("the given number is even");
        }
    }
    static boolean Odd(int n){
        return ((n&1)==1);
    }
}
