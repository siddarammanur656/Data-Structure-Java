package Strings;

public class Goal_Parser_Interpretation1678 {
    public static void main(String[] args) {
        String command="G()(al)";
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {
        StringBuilder Builder= new StringBuilder();
        char [] ans = command.toCharArray();
        for (int i = 0; i < command.length(); i++) {
            if(ans[i]=='(' && ans[i+1]==')'){
                Builder.append("o");
            } if (ans[i]=='(' && ans[i+1]=='a' && ans[i+2]=='l' && ans[i+3]==')') {
                Builder.append("al");
            }if(ans[i]=='G') {
                Builder.append(ans[i]);
            }
        }
        return Builder.toString();
    }
}