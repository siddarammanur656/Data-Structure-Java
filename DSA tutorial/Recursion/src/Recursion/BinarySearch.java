package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,56,67,89};
        int target=67;
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
}
