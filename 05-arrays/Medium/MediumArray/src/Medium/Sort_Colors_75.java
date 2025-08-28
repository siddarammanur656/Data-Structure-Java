package Medium;

import java.util.Arrays;

public class Sort_Colors_75 {
    public static void main(String[] args) {
        int [] nums={2,0,2,1,1,0};
//        sortColors(nums);
//        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(sortColors1(nums)));
    }
    static void sortColors(int[] nums) {
        int zeropointer=0;
        int twopointer=nums.length-1;

        int i=0;
        while(i<=twopointer){
            if(nums[i]==0){
                swap(nums,i,zeropointer);
                i++;
                zeropointer++;
            }else if(nums[i]==2){
                swap(nums,i,twopointer);
                twopointer--;
            }else{
                i++;
            }
        }
    }
    static void swap(int [] nums,int start, int end){
        int temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }

    //using built in fuction
    static int [] sortColors1(int[] nums){
        Arrays.sort(nums);
        return nums;
    }
}
