package Strings;

import java.util.Arrays;

public class Sorting_the_Sentence {

    public static void main(String[] args) {
        String s="is2 sentence4 This1 a3";
        System.out.println(sortSentence(s));
    }

    public static String sortSentence(String s) {

        String [] words=s.split(" ");
        String [] ans = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                if (words[words[i].length()-1]==words[words[i].length()-1]){
                    for (int k = 0; k < words[i].length()-1; k++) {
                        ans[i]=ans[k];
                    }
                }
            }
        }

        return Arrays.toString(ans);
    }

}