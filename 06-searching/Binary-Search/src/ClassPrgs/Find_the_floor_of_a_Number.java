package ClassPrgs;

public class Find_the_floor_of_a_Number {
    public static void main(String[] args) {
        int [] arr={2, 3, 5, 9, 14, 16, 18};
        int target=15;
        System.out.println(floorNumber(arr,target));
    }
    static int floorNumber(int [] arr, int target){
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
        return end;
    }
}
