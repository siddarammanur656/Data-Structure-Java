package Maths;

public class XORFrom0ToA {
    public static void main(String[] args) {
        int a = 2;
        int b=2;
        System.out.println("The XOR of numbers from 0 to " + a + " is: " + findXOR(a));
        System.out.println(xorInRange(a,b));
    }
    static int xorInRange(int a, int b) {
        return findXOR(b) ^ findXOR(a - 1);
    }

    static int findXOR(int a) {
        if (a % 4 == 0) {
            return a;
        } else if (a % 4 == 1) {
            return 1;
        } else if (a % 4 == 2) {
            return a + 1;
        } else { // a % 4 == 3
            return 0;
        }
    }
}