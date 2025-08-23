package Easy;
import java.util.Arrays;
public class How_Many_Numbers_Are_Smaller_Than_the_Current_Number_1365 {
    public static void main(String[] args) {
        int [] nums={8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int [] ans= new int[n];

        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
                if( j != i && nums[j] < nums[i] ){
                    count +=1;
                }
            }
            ans[i]=count;
        }
        return ans;
    }
}
