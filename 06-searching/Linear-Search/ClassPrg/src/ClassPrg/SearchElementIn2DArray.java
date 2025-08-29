package ClassPrg;

import java.util.Arrays;

public class SearchElementIn2DArray {
    public static void main(String[] args) {
        int [][] nums={
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target=99;
        System.out.println(Arrays.toString(Search(nums,target)));
        System.out.println(Arrays.toString(MinMax(nums)));
    }
    static int [] Search(int [][] nums, int target){
        if(nums.length==0){
            return new int [] {-1,-1};
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j]==target){
                    return new int [] {i, j};
                }
            }
        }
        return new int [] {-1,-1};
    }
    static int []  MinMax(int [][] nums){
        int min=nums[0][0];
        int max=nums[0][0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if(nums[i][j]<min){
                    min=nums[i][j];
                }
                if(nums[i][j]>max){
                    max=nums[i][j];
                }
            }
        }
        return new int [] {min, max};
    }
}
