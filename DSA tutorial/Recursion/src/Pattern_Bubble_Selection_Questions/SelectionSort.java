package Pattern_Bubble_Selection_Questions;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 8, 1};
        Selection_Sort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void Selection_Sort(int[] arr, int r, int c, int max) {
        if (r == 0) {
            return;
        }

        if (c < r) {
            if (arr[c] > arr[max]) {
                max = c;
            }
            Selection_Sort(arr, r, c + 1, max);
        } else {
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;

            Selection_Sort(arr, r - 1, 0, 0);
        }
    }
}