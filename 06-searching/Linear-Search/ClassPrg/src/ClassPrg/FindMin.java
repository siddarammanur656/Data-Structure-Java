package ClassPrg;

public class FindMin {
    public static void main(String[] args) {
        int [] nums={232,121,244,450,788};
        System.out.println(Min(nums));
    }

    static int Min(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        for (int i = 1; i < n; i++) {
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}
