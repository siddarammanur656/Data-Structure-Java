package BasicProblemsOfArrays;

public class MaxNumberInArray {
    public static void main(String[] args) {
        int [] arr={};
        int start=0;
        int end=arr.length-1;
        System.out.println(MaxNum(arr,start,end));
    }

   static int  MaxNum(int[] arr,int start,int end) {
           if(start>end){
               return -1;
           }
           if(arr.length==0){
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
