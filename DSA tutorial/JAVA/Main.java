
import java.util.*;
public class Main  {

    
    
    public static void main (String [] args){
        // int [] arr={7,4,8,9,2,1,13};
        // for(int i=0; i<arr.length; i+=2){
        //     System.out.println(arr[i]);
        // }

        // int [] arr={1,2,3,4,5,6,7,8,9,10};
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]%2 != 0){
        //         System.out.print(arr[i]+" ");
        //     }

            // System.out.println();
            // System.out.print(arr[i]+" ");



            int [] arr={9,6,3,2,5,98,45,67,21};
            int max=arr[0];
            int min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(max<arr[i]){
                    max=arr[i];
                }
                if(min>arr[i]){
                    min=arr[i];
                }
            }
            System.out.println(min);
            System.out.println(max);



            // int [] arr={88,65,43,21,9,3,56};
            // Arrays.sort(arr);
            // int min=arr[0];
            // int max=arr[arr.length-1];
            // System.out.println(min);
            // System.out.println(max);

        }
        
    }
    
    
