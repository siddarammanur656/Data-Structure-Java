package Medium;

import java.util.Arrays;

public class Spiral_Matrix_II_59 {
    public static void main(String[] args) {
        int n=3;
        System.out.println(Arrays.deepToString(generateMatrix(n)));
    }
    public static int[][] generateMatrix(int n) {
        int r1=0,r2=n-1;
        int c1=0,c2=n-1;

        int [][] mat = new int[n][n];
        int val=1;

        while(r1<=r2 && c1<=c2){
            //move left-right
            for(int c=c1; c<=c2; c++){
                mat[r1][c]=val++;
            }

            //right column move down
            for(int r=r1+1; r<=r2; r++){
                mat[r][c2]=val++;
            }

            //move right to left
            //move up mean bottom to top
            if(r1<r2 &&  c1<c2){
                //move right to left
                for(int c=c2-1; c>=c1; c--){
                    mat[r2][c]=val++;
                }
                //move up
                for(int r=r2-1; r>r1; r--){
                    mat[r][c1]=val++;
                }
            }

            r1++;
            r2--;
            c1++;
            c2--;

        }
        return mat;
    }
}
