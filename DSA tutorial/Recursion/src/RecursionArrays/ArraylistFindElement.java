package RecursionArrays;

import java.util.ArrayList;

public class ArraylistFindElement {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 99};
        int target = 5;
//        ArrayList<Integer> result = FindElementIndex(arr, target, 0, new ArrayList<>());
//        System.out.println(result);
        System.out.println(FindAllIndex(arr, target,0));
    }

    static ArrayList<Integer> FindElementIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return FindElementIndex(arr, target, index + 1, list); // Ensure recursive call returns
    }

    static ArrayList<Integer> FindAllIndex(int [] arr , int target , int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = FindAllIndex(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);
        return list;
    }
}