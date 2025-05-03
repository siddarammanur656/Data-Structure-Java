package RecursionEasyproblems;

public class Number_of_Steps_to_Reduce_a_Number_to_Zero {
    public static void main(String[] args) {
        int num =14;
        System.out.println(numberOfSteps(num));
    }
    public static int numberOfSteps(int num) {
        return Helpers(num,0);
    }

    private static int Helpers(int num, int steps) {
        if(num==0){
            return steps;
        }
        if(num%2==0){
            return Helpers(num/2,steps+1);
        }else{
            return Helpers(num-1,steps+1);
        }
    }
}