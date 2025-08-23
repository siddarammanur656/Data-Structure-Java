package BasicProblemsOfArrays;

public class MaxNumBetweenRange {
    public static void main(String[] args) {

        int [] arr= {89,2,3,5,3,455,245,567};
        int start=0;
        int end= 4;
        System.out.println(MaxNumBetweenRange(arr,start,end));

    }
    static  int MaxNumBetweenRange(int [] arr, int start, int end){

        if(start<0 || end>= arr.length || start>end){
            return -1;
        }

        int max=arr[start];
        for (int i =start+1; i <=end; i++) {

            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
}
