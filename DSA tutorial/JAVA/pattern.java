public class pattern {
    public static void main(String[] args) {
        int rows=4;
        for (int i =rows-1; i>=0; i--){
            for (int j =0; j<=i; j++){
                System.out.println("*"+" ");
          }
          System.out.println();
        }
    }
}