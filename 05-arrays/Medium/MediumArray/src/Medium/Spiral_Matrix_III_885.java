package Medium;

import java.util.Arrays;

public class Spiral_Matrix_III_885 {
    public static void main(String[] args) {
        int rows = 5, cols = 6, rStart = 1, cStart = 4;
        System.out.println(Arrays.deepToString(spiralMatrixIII(rows,cols,rStart,cStart)));
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int dx=0,dy=1,n=0,temp=0;
        int [][] ans= new int[rows*cols][2];

        int i=0;
        while(i<rows*cols){
            for(int j=0; j<(n/2)+1; j++){
                if (rStart >= 0 && rStart < rows && cStart >= 0 && cStart < cols) {
                    ans[i++] = new int[]{rStart, cStart};
                }
                rStart +=dx;
                cStart +=dy;
            }
            n++;

            temp=dx;
            dx=dy;
            dy=-1*temp;
        }
        return ans;
    }
}
