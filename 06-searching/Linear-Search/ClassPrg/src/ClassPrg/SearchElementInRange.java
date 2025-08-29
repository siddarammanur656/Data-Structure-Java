package ClassPrg;

public class SearchElementInRange {
    public static void main(String[] args) {
        int [] nums={18, 12, -7, 3, 14, 28};
        int target=3;
        int start=1;
        int end=4;
        System.out.println(search(nums,target,start,end));
    }
    static int search(int [] nums,int target, int start, int end){
        if(nums.length==0){
            return -1;
        }
        for (int i = start; i <end ; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
}
