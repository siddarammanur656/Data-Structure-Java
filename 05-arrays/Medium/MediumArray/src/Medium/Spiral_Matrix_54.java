package Medium;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix_54 {
    public static void main(String[] args) {
        int [][] matrix= {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(spiralOrder(matrix));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;

        int top=0,bottom=m-1,left=0,right=n-1;
        ArrayList<Integer> arr= new ArrayList<>();

        while(top<=bottom && left<=right){
            // Print top row from left to right
            for (int i = left; i <= right; ++i) {
                arr.add(matrix[top][i]);
            }
            top++;

            // Print right column from top to bottom
            for (int i = top; i <= bottom; ++i) {
                arr.add(matrix[i][right]);
            }
            right--;

            // Print bottom row from right to left (if exists)
            if (top <= bottom) {
                for (int i = right; i >= left; --i) {
                    arr.add(matrix[bottom][i]);
                }
                bottom--;
            }

            // Print left column from bottom to top (if exists)
            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    arr.add(matrix[i][left]);
                }
                left++;
            }
        }
        return arr;
    }
}
