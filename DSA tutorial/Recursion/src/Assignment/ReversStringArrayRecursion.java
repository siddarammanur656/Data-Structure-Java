package Assignment;

class ReversStringArrayRecursion {
    public static void main(String[] args) {
        char [] s = {'h','e','l','l','o'};
        reverse(s);
        System.out.println(s);
//        reverseString(s);
//        System.out.println(s);
//        String [] s = {"h","e","l","l","o"};
//        reverseString(s);
    }
    public static void reverseString(char[] s) {
        if(s.length==0){
            return ;
        }
        Helper(s,0,s.length-1);
    }
    static void Helper(char[] s, int start, int end){
            if(start>=end){
                return;
            }
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;

            Helper(s,start+1,end-1);
    }

    //using iteration
    static void reverse(char [] s){
        int start=0;
        int end=s.length-1;
        while(start<=end){
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
}