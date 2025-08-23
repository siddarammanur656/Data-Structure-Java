package functions;

public class Odd_Even {
    // Main Driver Method
    public static void main(String[] args) {

        int num = 11;
        OddOrEven(num);
    }
    static void OddOrEven(int num){
        if (num % 2 == 0) {
            System.out.println("Entered Number is Even");
        }
        else {
            System.out.println("Entered Number is Odd");
        }
    }
}