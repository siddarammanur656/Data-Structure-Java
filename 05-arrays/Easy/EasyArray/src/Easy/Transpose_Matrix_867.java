package Easy;

import java.util.Arrays;

public class Transpose_Matrix_867 {
    public static void main(String[] args) {
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    public  static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int cols = matrix[0].length;

        int[][] ans = new int[cols][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                ans[j][i] = matrix[i][j];
            }
        }

        return ans;

    }
}
