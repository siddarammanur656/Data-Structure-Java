package Easy;

import java.util.Arrays;

public class Find_N_Unique_Integers_Sum_up_to_Zero_1304 {
    public static void main(String[] args) {
        int n=3;
        System.out.println(Arrays.toString(sumZero(n)));
    }
    public static int[] sumZero(int n) {
        int start=0;
        int end=n-1;
        int [] arr = new int[n];

        while(start<end){
            arr[start]=start+1;
            arr[end]=arr[start]*(-1);
            start++;
            end--;
        }
        return arr;
    }
}
