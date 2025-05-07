import java.util.Scanner;
public class CArea{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double r = sc.nextDouble();
        double area=3.142*r*r;
        System.out.println(area);
    }
}