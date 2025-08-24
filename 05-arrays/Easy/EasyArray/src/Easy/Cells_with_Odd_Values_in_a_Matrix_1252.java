package Easy;

public class Cells_with_Odd_Values_in_a_Matrix_1252 {
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int [][] indices = {{0, 1}, {1, 1}};
        System.out.println(oddCells(m,n,indices));

    }
    public static int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];

            // Increment entire row r
            for (int j = 0; j < n; j++) {
                matrix[r][j]++;
            }

            // Increment entire column c
            for (int k = 0; k < m; k++) {
                matrix[k][c]++;
            }
        }

        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] % 2 == 1) count++;
            }
        }
        return count;

    }
}
