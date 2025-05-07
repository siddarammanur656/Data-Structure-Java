package RecursionArrays;

public class ArraySortedOrNot {

    public static void main(String[] args) {
        int [] arr={1,2,3,41,5,6};
        System.out.println(Sorted1(arr));
    }

    static boolean Sorted(int [] arr , int index){
        if(index== arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && Sorted(arr,index+1);
    }
    static boolean Sorted1(int [] arr){
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
