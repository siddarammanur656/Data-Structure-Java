package Medium;
import java.util.Arrays;

public class Rotate_Array_189 {
    public static void main(String[] args) {
        int [] nums= {1,2,3,4,5,6,7,8};
        int k=3;
        //rotate(nums,k);
        //System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(rotate2(nums,k)));
    }
    static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n

        // Step 1: Reverse the entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, n - 1);
    }

    static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }


    //using extra memory
    public static int []  rotate2(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Handle cases where k > n
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[(i + k) % n] = nums[i];
        }

        return ans;
    }

}
