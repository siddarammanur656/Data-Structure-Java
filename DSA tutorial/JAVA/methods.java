// function overloading 
// public class methods {
    // public static int sum(int a,int b){
    //     return a+b;
    // }
    // public static int sum(int a,int b,int c){
    //     return a+b+c;
    // }
    // public static void main(String[] args) {
    //     System.out.println(sum(3,5));
    //     System.out.println(sum(3,5,7));
    // }



    //different data types in function overloading 
//     public static int sum(int a,int b){
//         return a+b;
//     }
//     public static float sum(float a,float b,float c){
//         return a+b+c;
//     }
//     public static void main(String[] args){
//         System.out.println(sum(3,5));
//         System.out.println(sum(3.2f,5.0f,7.8f));
        
//     }
// }


// prime or not 
// public class methods{
    // public static boolean isPrime(int n){
    //     boolean isprime=true;
    //     for(int i=2;i<=n-1;i++){
    //         if(n%i==0){
    //             isprime=false;
    //             break;
    //         }
    //     }
    //     return isprime;
    // }

    // corner method 
    public class methods{
        public static boolean isPrime(int n){
            if (n<=1){
                return false;
            }
            if (n==2){
                return true;
            }
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
        public static void priminrange(int n){
            for(int i=2;i<=n;i++){
                if(isPrime(i)){
                    System.out.print(i+",");
                }
            }
            System.out.println();
        }
    public static void main(String[] args){
        System.out.println(isPrime(16));
        priminrange(50);
    }
}


//print prime number in range 
