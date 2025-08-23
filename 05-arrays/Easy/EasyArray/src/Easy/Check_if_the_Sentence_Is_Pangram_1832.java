package Easy;

import java.util.HashSet;

public class Check_if_the_Sentence_Is_Pangram_1832 {
    public static void main(String[] args) {
        String sentence="thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram1(sentence));
        System.out.println(checkIfPangram2(sentence));
        System.out.println(checkIfPangram3(sentence));
    }
    public static boolean checkIfPangram1(String sentence) {
        if(sentence.length()<26){
            return false;
        }else{
            for(char ch='a'; ch<='z';ch++){
                if(sentence.indexOf(ch)<0){
                    return false;
                }
            }
        }
        return true;
    }
     public static boolean checkIfPangram2(String sentence) {
         boolean[] seen = new boolean[26];

         for (char ch : sentence.toCharArray()) {
             if (ch >= 'a' && ch <= 'z') {
                 seen[ch - 'a'] = true;
             }
         }

         // check if all letters a-z are seen
         for (boolean b : seen) {
             if (!b) return false;
         }
         return true;
     }
    public static boolean checkIfPangram3(String sentence) {
         HashSet<Character> set = new HashSet<>();
         for(int i=0; i<sentence.length(); i++){
             set.add(sentence.charAt(i));
         }
         //System.out.println(sentence.length());
         return (set.size()==26);
     }
}
