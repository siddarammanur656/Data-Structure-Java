package Assignment;

public class MaxMinUsingRecursion {
    public static void main(String[] args) {
       int [] arr = {1, 4, 3, -5, -4, 8, 6};
        System.out.println(Min(arr,0,arr[0]));
    }
    //max
    static int Max(int [] arr,int index,int max){
        if(index== arr.length-1){
            return max;
        }
        if(arr[index]>=max){
            max=arr[index];
        }
        return Max(arr,index+1,max);
    }
    //min
    static int Min(int [] arr, int index, int min) {
        if (index == arr.length-1) {
            return min;
        }
        if (arr[index] < min) {
            min = arr[index];
        }
        return Min(arr, index + 1, min);
    }

}
