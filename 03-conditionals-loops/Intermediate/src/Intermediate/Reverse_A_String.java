package Intermediate;

public class Reverse_A_String {
    static String reverseString(String s) {
        StringBuilder res = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            res.append(s.charAt(i));
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "abc";
        String res = reverseString(s);
        System.out.print(res);
    }
}
