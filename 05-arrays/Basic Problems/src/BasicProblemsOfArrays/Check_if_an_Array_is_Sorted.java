package BasicProblemsOfArrays;

public class Check_if_an_Array_is_Sorted {
    public static void main(String[] args) {
        int [] arr= {10,20,30,40,50};
        System.out.println(Sorted(arr));
    }
    static boolean Sorted(int [] arr){
        int n= arr.length;
        if(n==1 || n==0){
            return true;
        }
        for (int i = 1; i < n; i++) {
            if(arr[i-1]>arr[i]){
                return false;
            }
        }
        return true;
    }
}
