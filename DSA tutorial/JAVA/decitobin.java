public class decitobin {
    public static void decitobin(int n){
        int pow=0;
        int decbin=0;
        while (n>0) {
            int rem=n%2;
            decbin=decbin+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;
        }
        System.out.println("Decimal to binary convertion is :"+decbin);
    }

    public static void main(String[] args) {
        decitobin(7);
    }
}
