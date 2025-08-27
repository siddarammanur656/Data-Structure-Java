package Medium;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array_34 {
    public static void main(String[] args) {
        int [] nums={5,7,7,8,8,10};
        int target=8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int start = -1;
        int end = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (start == -1) {
                    start = i; // first time we see target
                }
                end = i; // keep updating to last time we see target
            }
        }

        return new int[] {start, end};
    }
}
