package Easy;

import java.util.Arrays;

public class Running_Sum_of_1d_Array_1480 {
    public static void main(String[] args) {
        int [] nums={1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    public static int[] runningSum(int[] nums) {
        int n= nums.length;

        for(int i=1; i<n; i++){
            nums[i]=nums[i-1]+nums[i];
        }
        return nums;
    }
}
