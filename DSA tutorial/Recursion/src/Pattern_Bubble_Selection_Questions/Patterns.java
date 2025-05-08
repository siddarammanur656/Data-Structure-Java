package Pattern_Bubble_Selection_Questions;

public class Patterns {
    public static void main(String[] args) {
        //Pattern2(4,0);
        Pattern4(4);
    }

    static void Pattern1(int r,int c ){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*"+" ");
            Pattern1(r, c+1);
        }else {
            System.out.println();
            Pattern1(r-1,0);
        }
    }
    static void Pattern2(int r,int c ){
        if(r==0){
            return;
        }
        if(c<r){
            Pattern2(r, c+1);
            System.out.print("*"+" ");
        }else {
            Pattern2(r-1,0);
            System.out.println();
        }
    }
    static void Pattern3(int n){
        for (int i =0; i <=n; i++) {
            for (int j = 0; j<=n-i-1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
    static void Pattern4(int n){
        for (int i =0; i <n; i++) {
            for (int j = 0; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

}
