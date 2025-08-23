package BasicProblemsOfArrays;

import java.util.ArrayList;

public class Leaders_in_an_array {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 18, 5, 2};
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                res.add(arr[i]);
            }
        }

        System.out.println("Leaders in the array: " + res);
    }
}