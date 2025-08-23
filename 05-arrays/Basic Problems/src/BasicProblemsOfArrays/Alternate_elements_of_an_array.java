package BasicProblemsOfArrays;

import java.util.ArrayList;

//Given an array arr[], the task is to print every alternate element of the array starting from the first element.
public class Alternate_elements_of_an_array {
    public static void main(String[] args) {
        int [] arr ={10,20,30,40,50};

//        Iterative Approach
//        for (int i = 0; i < arr.length; i+=2) {
//            System.out.print(arr[i]+" ");
//        }
//        System.out.println(GetAlternateElement(arr));

        System.out.println(getAlternate(arr));
    }
    //Iterative Approach
//    static ArrayList<Integer> GetAlternateElement(int [] arr){
//        ArrayList<Integer> res= new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i+=2) {
//            res.add(arr[i] );
//        }
//        return res;
//    }

    //Recursive Approach

    static ArrayList<Integer> getAlternate(int [] arr){
        ArrayList<Integer> res = new ArrayList<>();
        GetAlternateRecursion(arr, 0, res);
        return res;
    }

   static void GetAlternateRecursion(int[] arr, int idx, ArrayList<Integer> res) {
        if(idx<arr.length){
            res.add(arr[idx]);
            GetAlternateRecursion(arr,idx+2,res);
        }
    }

}
