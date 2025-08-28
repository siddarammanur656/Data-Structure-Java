package Medium;

public class Jump_Game_55 {
    public static void main(String[] args) {
        int [] nums={2,3,1,1,4};
        //int [] nums={3,2,1,0,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int MaxReach=0;
        for(int i=0; i<nums.length; i++){
            if(i>MaxReach){
                return false;
            }else{
                MaxReach=Math.max(MaxReach, i+nums[i]);
            }
        }
        return true;
    }
}
