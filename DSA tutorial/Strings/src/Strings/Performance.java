package Strings;

public class Performance {
    public static void main(String[] args) {
        String series="";
        for (char i = 0; i < 26; i++) {
          char ch=(char)('a'+i);
            series=series+ch;
        }
        System.out.println(series);
    }
}
