package Maths;

public class ElementAppearsOnceinArray {
    public static void main(String[] args) {
        int [] arr={2,3,4,1,2,1,3,6,4};
        //int [] arr={2,3,-3,-2,6,5,-5};
        System.out.println(ElementAppearsOnce(arr));
    }
    static int ElementAppearsOnce(int [] arr){
        int ans=0;
        for (int i = 0; i < arr.length; i++) {
            ans=ans^arr[i];
        }
        return ans;
    }
}
