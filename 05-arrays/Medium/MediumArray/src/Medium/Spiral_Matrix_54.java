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
        int r1=0,r2=matrix.length-1;
        int c1=0,c2=matrix[0].length-1;

        ArrayList<Integer> Ans= new ArrayList<>();

        while(r1<=r2 && c1<=c2){
            //move left to right
            for(int c=c1; c<=c2; c++){
                Ans.add(matrix[r1][c]);
            }

            //move right column move down
            for(int r=r1+1; r<=r2; r++){
                Ans.add(matrix[r][c2]);
            }

            //move right to left
            //move up
            if(r1 < r2 && c1 < c2){
                //move right to left
                for(int c=c2-1; c>=c1; c--){
                    Ans.add(matrix[r2][c]);
                }
                //move up bottom to top
                for(int r=r2-1; r>r1; r--){
                    Ans.add(matrix[r][c1]);
                }
            }
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return Ans;
    }
}
