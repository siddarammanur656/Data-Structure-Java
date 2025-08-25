package Easy;

public class Remove_Duplicates_from_Sorted_Array_26 {
    public static void main(String[] args) {
        int [] nums ={1,1,2,2,3,3,4,5,5,6};
        System.out.println(removeDuplicates(nums));
    }
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k=0;
        for(int i=1; i<n; i++){
            if(nums[k] != nums[i]){
                k++;
                nums[k]=nums[i];
            }
        }
        return k+1;
    }
}
