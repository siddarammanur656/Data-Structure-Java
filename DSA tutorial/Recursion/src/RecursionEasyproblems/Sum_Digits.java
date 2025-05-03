package RecursionEasyproblems;

public class Sum_Digits {
    public static void main(String[] args) {
        int n=39;
        System.out.println(Product(n));
    }
    //Sum of all digits
    static int Sum(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)+Sum(n/10);
    }
    //Product of all digits
    static int Product(int n){
        if(n%10==n){
            return n;
        }
        return (n%10)*Product(n/10);
    }
}
