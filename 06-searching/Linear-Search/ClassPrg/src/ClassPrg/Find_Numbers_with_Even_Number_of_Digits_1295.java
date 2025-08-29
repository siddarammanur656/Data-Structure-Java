package ClassPrg;

public class Find_Numbers_with_Even_Number_of_Digits_1295 {
    public static void main(String[] args) {
        int [] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int count=0;
        for(int i=0; i<nums.length; i++){
            if(even(nums[i])){
                count++;
            }
        }
        return count;
    }
    public static boolean even(int digit){
        int countnum=0;
        while(digit>0){
            countnum++;
            digit /=10;
        }
        return countnum % 2==0;
    }
}
