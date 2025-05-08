package Assignment;

public class First_uppercase_letter {
    public static void main(String[] args) {
        String str="sid";
        System.out.println(Uppercase1(str,0));
    }
    //using Iteration method
    static char Uppercase(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))){
                return str.charAt(i);
            }
        }
        return 0;
    }
    //using Recursion
    static char Uppercase1(String str,int index) {

        if(index>=str.length()){
            return ' ';
        }
        if(Character.isUpperCase(str.charAt(index))){
            return str.charAt(index);
        }
        return Uppercase1(str, index+1);
    }
}
