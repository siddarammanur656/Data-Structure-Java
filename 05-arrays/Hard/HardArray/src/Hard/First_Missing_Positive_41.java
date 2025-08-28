package Hard;

public class First_Missing_Positive_41 {
    public static void main(String[] args) {
        int [] nums={3,4,-1,1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        int n=nums.length;

        int i=0;
        while(i<n){
            int currentIndex=nums[i]-1;

            if(nums[i]>0 && nums[i]<=n && nums[currentIndex]!=nums[i]){
                Swap(nums, i, currentIndex);
            }else{
                i++;
            }
        }
        for(i=0; i<n; i++){
            if(nums[i] !=i+1){
                return i+1;
            }
        }
        return n+1;
    }
    public static void Swap(int [] nums, int left, int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}
