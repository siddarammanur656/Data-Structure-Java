package Easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Add_to_Array_Form_of_Integer_989 {
    public static void main(String[] args) {
        int [] num={1,2,0,0};
        int k=34;
        System.out.println(addToArrayForm(num,k));
    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        int n=num.length;

        for(int i=n-1;i>=0; i--){
            k+=num[i];
            list.add(k%10);
            k/=10;
        }
        while(k>0){
            list.add(k%10);
            k/=10;
        }
        Collections.reverse(list);
        return list;
    }
}
