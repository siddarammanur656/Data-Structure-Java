package Maths;

class Factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
    static int factorial(int n) {
        int ans=1;
        for (int i = 1; i <=n; i++) {
            ans=ans*i;
        }
        return ans;
    }
}