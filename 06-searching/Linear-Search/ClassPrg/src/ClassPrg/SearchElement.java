package ClassPrg;

public class SearchElement {
    public static void main(String[] args) {
        int [] nums={23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target=19;
        System.out.println(searchelement2(nums,target));
    }
    //return index element if element is found
    static int searchelement(int [] nums, int target){
        if(nums.length==0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    //return boolean value if element is found
    static boolean searchelement1(int [] nums, int target){
        if(nums.length==0){
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
    //return element if element is found
    static int searchelement2(int [] nums, int target){
        if(nums.length==0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return nums[i];
            }
        }
        return -1;
    }
}
