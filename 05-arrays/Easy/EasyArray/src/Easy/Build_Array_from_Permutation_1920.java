package Easy;

import java.util.Arrays;

public class Build_Array_from_Permutation_1920 {

    public static void main(String[] args) {
        int [] nums={5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }

    static int[] buildArray(int[] nums) {
        int n=nums.length;
        int [] newArr= new int[n];
        for(int i=0; i<n; i++){
            int index=nums[i];
            newArr[i]=nums[index];
        }
        return newArr;
    }
}
