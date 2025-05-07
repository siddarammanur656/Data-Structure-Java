import java.util.Scanner;
public class Examscore {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ts=25;
        double sum=0;
        
       for(int i =1; i<=ts; i++){
            System.out.println("enter the exam score: "+i);
            double score=input.nextDouble();
            sum +=score;
       }
       double average = sum / ts;
       System.out.println("average score is: "+average);
    }
}
