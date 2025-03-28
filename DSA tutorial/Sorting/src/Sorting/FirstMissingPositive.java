package Sorting;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int [] nums ={7,8,9,11,12};
        System.out.println(firstMissingPositive(nums));
    }
    static int firstMissingPositive(int[] nums) {
        int i=0;
        while(i<nums.length){
            int currect=nums[i]-1;
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[currect]){
                swap(nums,i,currect);
            }else{
                i++;
            }
        }
        for (int index = 0; index < nums.length; index++) {
            if(nums[index]!=index+1){
                return index+1;
            }
        }
        return nums.length+1;
    }
    static void  swap(int [] arr ,int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}