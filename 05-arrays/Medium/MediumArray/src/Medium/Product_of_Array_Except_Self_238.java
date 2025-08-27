package Medium;

import java.util.Arrays;

public class Product_of_Array_Except_Self_238 {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
    //without using division method
    public static int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] ans=new int[n];

        int prodl=1;
        int prodr=1;

        for(int i=n-1; i>=0; i--){
            ans[i]=prodr;
            prodr=prodr*nums[i];
        }

        for(int i=0; i<n; i++){
            ans[i]=ans[i]*prodl;
            prodl=prodl*nums[i];
        }
        return ans;
    }
    //by using division method
    public static int[] productExceptSelf1(int[] nums) {
        int n=nums.length;
        int product=1;
        //find the product of element in the array
        for(int i=0; i<n; i++){
            product *=nums[i];
        }
        for(int i=0; i<n; i++){
            nums[i]=product/nums[i];
        }
        return nums;
    }
}
