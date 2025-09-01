package ClassPrgs;

public class Find_position_of_an_element_in_a_sorted_array_of_infinite_numbers {
    public static void main(String[] args) {
        int [] arr={3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target=10;
        System.out.println(ans(arr,target));
    }
    static int ans(int [] arr, int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return binary_search(arr,target,start,end);
    }

    static int binary_search(int[] arr, int target, int start, int end) {
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
