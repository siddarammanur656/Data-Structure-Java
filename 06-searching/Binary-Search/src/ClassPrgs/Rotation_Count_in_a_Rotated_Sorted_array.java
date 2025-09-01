package ClassPrgs;

public class Rotation_Count_in_a_Rotated_Sorted_array {
    public static void main(String[] args) {
        int [] arr={15, 18, 27, 35, 63, 122};
        System.out.println(search(arr));
    }
    static int search(int [] arr){
        int pivot=findpivot(arr);
        return pivot+1;
    }

    static int findpivot(int[] arr) {
        int start=0;
        int end= arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start &&  arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
