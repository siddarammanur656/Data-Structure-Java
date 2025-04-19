package Patterns;

public class Patterns {

    public static void main(String[] args) {
        int n=5;
        Pattern17(n);
    }

    static void  Pattern1(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void  Pattern2(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void  Pattern3(int n){
        for (int row = 1; row <= n; row++) {
            int totalcol=n-row+1;
            for (int col = 1; col <=totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void  Pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }

    static void  Pattern5(int n){
        for (int row = 1; row <= 2*n; row++) {
            int totalcol= row>n?2*n-row:row;
            for (int col = 1; col <=totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void Pattern6(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n - row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void Pattern7(int n){
        for (int row = 0; row <n; row++) {
            for (int spacecol = 0; spacecol <row; spacecol++) {
                System.out.print(" ");
            }
            for (int col = 0; col < n-row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void Pattern8(int n){
        for (int row = 0; row <n ; row++) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print("*" + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
    static void Pattern9(int n){
        for (int row = n-1; row >=0 ; row--) {

            for (int space = 0; space < n-row; space++) {
                System.out.print("  ");
            }
            for (int col = row; col >= 1; col--) {
                System.out.print("*" + " ");
            }
            for (int col = 2; col <= row; col++) {
                System.out.print("*" + " ");
            }

            System.out.println();
        }
    }
    static void Pattern10(int n){
        for (int row = 0; row < n; row++) {
            for (int space = 0; space <n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern11(int n){
        for (int row =n-1; row >=0; row--) {
            for (int space = 0; space <n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern12(int n){
        for (int row =n-1; row >=0; row--) {
            for (int space = 0; space <n-row; space++) {
                System.out.print(" ");
            }
            int totalcol=row>n?2*n-row:row;

            for (int col = 0; col <=totalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void Pattern17(int n) {
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print("  ");
            }

            for (int col = c; col >= 1; col--) {
                System.out.print(col + " ");
            }
            for (int col = 2; col <= c; col++) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
