package Easy;

import java.util.Arrays;

public class Reshape_the_Matrix_566 {
    public static void main(String[] args) {
        int [][] mat={{1,2},{3,4}};
        int r=1;
        int c=4;
        System.out.println(Arrays.deepToString(matrixReshape(mat,r,c)));
    }
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m=mat.length;
        int n=mat[0].length;

        if(m*n!=r*c || m==r && n==c){
            return mat;
        }
        int [][] reshaped= new int [r][c];
        for(int i=0; i<r*c; i++){
            reshaped[i / c][i % c] = mat[i / n][i % n];
        }
        return reshaped;
    }
}
