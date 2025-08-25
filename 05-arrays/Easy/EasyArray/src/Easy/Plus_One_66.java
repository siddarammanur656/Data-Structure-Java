package Easy;

import java.util.Arrays;

public class Plus_One_66 {
    public static void main(String[] args) {
        int [] digits={1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }


        int[] result = new int[n + 1];
        result[0] = 1; //  9 + 1 = 10 ->[1,0]
        return result;
    }
}
