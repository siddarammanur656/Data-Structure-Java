package Medium;

public class House_Robber_198 {
    public static void main(String[] args) {
        int [] nums={2,7,9,3,1};
        System.out.println(rob(nums));
    }
    public static int rob(int[] nums) {
        int prev1 = 0;// Maximum loot up to the previous house
        int prev2 = 0;// Maximum loot up to the house before the previous one
        for (int i = 0; i < nums.length; i++) {
            int temp = prev1;
            prev1 = Math.max(prev2 + nums[i], prev1);
            prev2 = temp;
        }

        return prev1;
    }
}
