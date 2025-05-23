package Sorting;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumber {
    public static void main(String[] args) {
        int [] nums ={4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while(i<nums.length){
            int currect=nums[i]-1;
            if(nums[i]!=nums[currect]){
                swap(nums,i,currect);
            }else{
                i++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void  swap(int [] arr ,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}