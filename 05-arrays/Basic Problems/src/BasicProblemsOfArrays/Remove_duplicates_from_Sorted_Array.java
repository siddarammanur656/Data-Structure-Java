package BasicProblemsOfArrays;

import java.util.ArrayList;

public class Remove_duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;

        int index = 1; // Start from second element

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }

        return index; // New length of array with unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = removeDuplicates(arr);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

