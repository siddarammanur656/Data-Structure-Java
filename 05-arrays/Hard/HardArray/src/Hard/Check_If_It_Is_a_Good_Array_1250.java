package Hard;

public class Check_If_It_Is_a_Good_Array_1250 {
    public static void main(String[] args) {
        int [] nums={12,5,7,23};
        System.out.println(isGoodArray(nums));
    }
    public static boolean isGoodArray(int[] nums) {
        int n=nums.length;
        int ans=nums[0];

        for(int i=1; i<n; i++){
            ans=GCD(ans,nums[i]);
        }
        return ans==1;
    }
    public static int GCD(int a, int b){
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
