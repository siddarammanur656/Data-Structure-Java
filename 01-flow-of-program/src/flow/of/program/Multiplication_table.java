package flow.of.program;

public class Multiplication_table {
    public static void main(String[] args) {
        int n=5;
        multiplication(n);
    }
    static void multiplication(int n){
        for (int i = 1; i <=10; i++) {
            int res=n*i;
            System.out.println(n+" * "+i+" = "+res);
        }
    }
}
