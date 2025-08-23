package conditionals.loops;

public class Parimeters {

    public static void main(String[] args) {
        System.out.println(Circle(4));
        System.out.println(Equilateral_Triangle(5));
        System.out.println(Parallelogram(4,6));
        System.out.println(Triangle(4,8));
        System.out.println(Squre(4));
        System.out.println(Rhombus(8));
    }

    static double Rhombus(int a) {
        double P=4*a;
        System.out.print("Parimeter of Rhombus:");
        return P;
    }

    static double Squre(int a) {
        double P=4*a;
        System.out.print("Parimeter of Squre:");
        return P;
    }

    static double Triangle(int l, int w) {
        double P=2*(l*w);
        System.out.print("Parimeter of Triangle:");
        return P;
    }

    private static double Parallelogram(int l, int b) {
        double P=2*(l*b);
        System.out.print("Parimeter of Parallelogram: ");
        return P;
    }

    static double Equilateral_Triangle(int a) {
        double P=3*a;
        System.out.print("Parimeter Equilateral Triangle: ");
        return P;
    }

    static double Circle(int r) {
        double P=2*3.142*r;
        System.out.print("Parimeter of Circle: ");
        return P;
    }

}
