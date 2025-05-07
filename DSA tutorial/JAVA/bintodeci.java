public class bintodeci {
    public static void bintodeci(int binnum){
        int decnum = 0;
        int pow=0;
        while(binnum>0){
            int lastdigit=binnum%10;
            decnum=decnum+(lastdigit*(int)Math.pow(2,pow));
            pow++;
            binnum=binnum/10;
        }
        System.out.println("Decimal equivalent of binary number is: "+decnum);
    }
    public static void main(String[] args) {
        bintodeci(101);
    }
}
