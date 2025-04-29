package Maths;

public class ElementAppearsThriceinArray {
    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 3, 4, 4, 4};
        System.out.println(ElementAppearsOnce(arr));
    }
    static int ElementAppearsOnce(int [] arr){
        int result = 0;
        // Iterate over every bit position (0 to 31)
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            int bit = (1 << i);

            // Count how many numbers have the i-th bit set
            for (int num : arr) {
                if ((num & bit) != 0) {
                    sum++;
                }
            }

            // If bit count is not divisible by 3, it's part of the unique number
            if (sum % 3 != 0) {
                result |= bit;
            }
        }
        return result;
    }
}
