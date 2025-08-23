package conditionals.loops;

public class Subtract_the_Product_and_Sum_of_Digits_1281_leetcode {
    public static void main(String[] args) {
        int n=234;
        System.out.println(subtractProductAndSum(n));
    }
   static int subtractProductAndSum(int n) {

        int product=1;
        int sum=0;

        while(n>0){
            int rem=n%10;
            product *= rem;
            sum+=rem;
            n/=10;
        }
        int diff=product-sum;
        return diff;
    }
}
