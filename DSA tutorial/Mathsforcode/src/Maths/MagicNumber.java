package Maths;

public class MagicNumber {
    public static void main(String[] args) {
        int n=6;
        System.out.println(Nthmagicnumber(n));
    }
    static int Nthmagicnumber(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }
        return ans;
    }
}
