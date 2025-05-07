public class Finvertedhalfpywnum {
    public static void invertedhalfpyramid(int r,int c) {
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j < r-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        invertedhalfpyramid(8, 9);

    }
}
