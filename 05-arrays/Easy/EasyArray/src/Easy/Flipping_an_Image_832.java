package Easy;
import java.util.Arrays;
public class Flipping_an_Image_832 {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;

        for(int i=0; i<n; i++){
            int start=0, end=image[i].length-1;
            while(start<end){
                int temp=image[i][start];
                image[i][start]=image[i][end];
                image[i][end]=temp;

                start++;
                end--;
            }
        }

        for(int i=0; i<image.length;  i++){
            for(int j=0; j<image[i].length; j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                }else{
                    image[i][j]=1;
                }
            }
        }
        return image;
    }
}
