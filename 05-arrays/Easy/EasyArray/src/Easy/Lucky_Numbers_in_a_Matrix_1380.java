package Easy;

import java.util.ArrayList;
import java.util.List;

public class Lucky_Numbers_in_a_Matrix_1380 {
    public static void main(String[] args) {
        int [][] matrix = {{3, 7, 8}, {9, 11, 13}, {15, 16, 17}};
        System.out.println(luckyNumbers(matrix));
    }
    public static List<Integer> luckyNumbers(int[][] matrix) {
        int n=matrix.length;

        ArrayList<Integer> rowmin= new ArrayList<>();
        for(int i=0; i<n; i++){
            int rmin=Integer.MAX_VALUE;
            for(int j=0; j<matrix[i].length; j++){
                rmin = Math.min(rmin,matrix[i][j]);
            }
            rowmin.add(rmin);
        }

        ArrayList<Integer> colmax= new ArrayList<>();
        for(int i=0; i<matrix[0].length; i++){
            int cmax=Integer.MIN_VALUE;
            for(int j=0; j<n; j++){
                cmax = Math.max(cmax,matrix[j][i]);
            }
            colmax.add(cmax);
        }

        ArrayList<Integer> lucky_num= new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<matrix[i].length; j++){
                if(matrix[i][j]==rowmin.get(i) && matrix[i][j]==colmax.get(j)){
                    lucky_num.add(matrix[i][j]);
                }
            }
        }
        return lucky_num;
    }
}
