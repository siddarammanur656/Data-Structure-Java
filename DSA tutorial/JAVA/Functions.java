import java.util.*;
public class Functions {
    public static int factorial(int n) {
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
            
        }
        return f;
    }
    public static int binomialcoff(int n,int r) {
        int nf=factorial(n);
        int rf=factorial(r);
        int nf_rf=factorial(n-r);
        int binom=nf/(rf*nf_rf);
        return binom;
    }

   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int r=sc.nextInt();
    int f=factorial(n);
    int binom=binomialcoff(n,r);
    System.out.println("factorial of "+n+" is "+f);
    System.out.println("binomial coff:"+binom);

   }

}