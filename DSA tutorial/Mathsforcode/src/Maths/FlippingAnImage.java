package Maths;

public class FlippingAnImage {
    public static void main(String[] args) {
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        System.out.println("Original Image:");
        printImage(image);

        int[][] flippedInvertedImage = flipAndInvertImage(image);

        System.out.println("Flipped and Inverted Image:");
        printImage(flippedInvertedImage);
    }

    public static int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int i = 0; i < (image[0].length + 1) / 2; i++) {
                int temp = row[i] ^ 1;
                row[i] = row[image[0].length - i - 1] ^ 1;
                row[image[0].length - i - 1] = temp;
            }
        }
        return image;
    }

    public static void printImage(int[][] image) {
        for (int[] row : image) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}