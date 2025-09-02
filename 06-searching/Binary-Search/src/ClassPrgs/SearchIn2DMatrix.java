package ClassPrgs;

import java.util.Arrays;

//Matrix sorted in a row and column wise  and find the target
public class SearchIn2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        int target=37;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    static int [] search(int[][] matrix, int target){
        int row=0;
        int cols=matrix[0].length-1;

        while(row< matrix.length && cols>=0){
            if(matrix[row][cols]==target){
                return new int [] {row,cols};
            }
            if(target>matrix[row][cols]){
                row++;
            }else {
                cols--;
            }
        }
        return new int [] {-1,-1};
    }
}
