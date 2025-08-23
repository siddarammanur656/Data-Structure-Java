package functions;

public class Factorial {
    public static void main(String[] args) {
        int n=4;
        System.out.println(factorial(n));
    }
    static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fact=1;
        for (int i = 1; i <=n ; i++) {
            fact *=i;
        }
        return fact;
    }
}
