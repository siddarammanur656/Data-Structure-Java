package Easy;

import java.util.ArrayList;
import java.util.Arrays;

public class Create_Target_Array_in_the_Given_Order_1389 {
    public static void main(String[] args) {
        int [] nums={0,1,2,3,4};
        int [] index={0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int n= nums.length;

        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(index[i],nums[i]);
        }

        int[] result = new int[arr.size()];
        for (int i = 0; i < n; i++) {
            result[i] = arr.get(i);
        }

        return result;
    }
}
