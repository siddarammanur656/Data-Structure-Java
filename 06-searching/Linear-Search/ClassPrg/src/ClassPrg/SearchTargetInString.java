package ClassPrg;

public class SearchTargetInString {
    public static void main(String[] args) {
        String str="Siddarama";
        char target='w';
        System.out.println(Search1(str,target));
    }
    //returning an index of char if char if founded
    static int Search(String str, char target){
        if(str.isEmpty()){
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
    //return boolean value if char is founded
    static boolean Search1(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
