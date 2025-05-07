public class Finvertedrotatedp {

public static void invertedrotated(int rows,int columns){
    for (int  i=1;i<=rows;i++){
        for (int j=1;j<=rows-i;j++){
            System.out.print(" ");

            }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
    }


}
    public static void main(String[] args) {
        invertedrotated(4, 5);
    }
}
