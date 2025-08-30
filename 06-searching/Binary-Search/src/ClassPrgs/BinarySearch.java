package ClassPrgs;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={2,3,4,5,6,7,12,34,45,56,66};
        int target=3;
        System.out.println(BS(arr,target));
    }
    //return the index of targeted element
    static int BS(int [] arr, int target){
        int start=0;
        int end= arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
