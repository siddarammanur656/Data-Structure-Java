package Assignment;

class BinarySearchRecursion {

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,56,67,89};
        int target=89;
        System.out.println(Search(arr,target,0, arr.length-1));
    }
    static int Search(int [] arr , int target, int start , int end){
        if (start>end){
            return -1;
        }
        int mid = start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            return Search(arr,target,start,mid-1);
        }
        return Search(arr,target,mid+1,end);
    }
    static int search1(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(target<nums[mid]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }

}