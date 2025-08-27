package Medium;

import java.util.Arrays;
import java.util.HashSet;

public class Set_Matrix_Zeroes_73 {
    public static void main(String[] args) {
        int [][] matrix={
                {1,1,1},
                {1,0,1},
                {1,1,1}
        };
        setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    public static void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        HashSet<Integer> rowset= new HashSet<>();
        HashSet<Integer> colset= new HashSet<>();

        //find the zero element row index and column index and add it to respective set
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matrix[i][j]==0){
                    rowset.add(i);
                    colset.add(j);
                }
            }
        }
        //make zero of whole row and column.
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(rowset.contains(i)|| colset.contains(j)){
                    matrix[i][j]=0;
                }
            }
        }
    }
}
