package Easy;

public class Maximum_Subarray_53 {
    public static void main(String[] args) {
        int [] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int n= nums.length;
        int Maxsum=Integer.MIN_VALUE;
        int CurrentSum=0;

        for(int i=0; i<n; i++){
            CurrentSum +=nums[i];

            if(CurrentSum>Maxsum){
                Maxsum=CurrentSum;
            }
            if(CurrentSum<0){
                CurrentSum=0;
            }
        }
        return Maxsum;
    }

}
