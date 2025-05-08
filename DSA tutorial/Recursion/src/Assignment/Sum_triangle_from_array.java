package Assignment;

import java.util.Arrays;

public class Sum_triangle_from_array {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        Triangle_sum1(arr);
        System.out.println(Arrays.toString(arr));

//        Triangle_sum(arr);
//        System.out.println(Arrays.toString(arr));
    }
    //Using Iteration
    static  void Triangle_sum(int [] arr){
        if(arr.length<1){
            return;
        }
        int [] temp = new int[arr.length-1];
        for (int i = 0; i <arr.length-1; i++) {

            int x=arr[i]+arr[i+1];
            temp[i]=x;
        }
        Triangle_sum(temp);
        System.out.println(Arrays.toString(arr));
    }


    //Using recursion
    static  void Triangle_sum1(int [] arr){
        if(arr.length==1){
            return;
        }
        int [] temp=new int [arr.length-1];
        helper(temp,arr,0);

        Triangle_sum1(temp);
        System.out.println(Arrays.toString(temp));
    }

    private static int []  helper(int[] temp, int[] arr, int index) {

        if(index== arr.length-1){
            return temp;
        }
        temp[index]=arr[index]+arr[index+1];
        return helper(temp, arr, index+1);
    }
}
