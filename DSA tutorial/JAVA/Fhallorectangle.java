import java.util.Scanner;

public class Fhallorectangle {

    // Method to print a hollow rectangle
    public static void hallo_rectangle(int rows, int columns) {
        // Loop to print the hollow rectangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                // Print '*' if it's the first or last row, or the first or last column
                if (i == 1 || i == rows || j == 1 || j == columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for number of rows and columns
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();

        // Call the method to print the hollow rectangle
        hallo_rectangle(rows, columns);

        scanner.close();
    }
}
