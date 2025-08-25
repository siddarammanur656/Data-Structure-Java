package Easy;

public class Determine_Whether_Matrix_Can_Be_Obtained_By_Rotation_1886 {
    public static void main(String[] args) {
        int [][] mat = {{0,1},{1,0}};
        int [][] target = {{1,0},{0,1}};
        System.out.println(findRotation(mat,target));
    }

    static boolean findRotation(int[][] mat, int[][] target) {
        for (int i=0 ; i<4 ; i++) {
            mat = rotate(mat);
            if ( checksame( mat , target ) ) {
                return true;
            }
        }
        return false;
    }

    static int[][] rotate(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int [][] rotated=new int [m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                rotated[j][n-i-1]=mat[i][j];
            }
        }
        return rotated;
    }

    static boolean checksame(int[][] mat, int[][] target) {
        if(mat.length==target.length && mat[0].length==target[0].length){
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[0].length; j++) {
                    if(mat[i][j] !=target[i][j]){
                        return false;
                    }
                }                
            }
        }
        return true;
    }
}
