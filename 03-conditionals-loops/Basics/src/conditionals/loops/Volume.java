package conditionals.loops;

public class Volume {
    public static void main(String[] args) {
        System.out.println(Cone(4,6));
        System.out.println(Prism(2,4));
        System.out.println(Cylinder(2,8));
        System.out.println(Sphere(4));
        System.out.println(Pyramid(4,2));
    }

    static double Pyramid(int B, int h) {
        double V=(B*h)/3;
        System.out.print("Volume of Cone: ");
        return V;
    }

    static double Sphere(int r) {
        double V=(4*3.142*r*r*r)/3;
        System.out.print("Volume of Sphere: ");
        return V;
    }

    static double Cylinder(int r, int h) {
        double V=3.142*r*r*h;
        System.out.print("Volume of Cylinder: ");
        return V;
    }

    static double Prism(int B, int h) {
        double V=B*h;
        System.out.print("Volume of Prism: ");
        return V;
    }

    static double Cone(int r, int h) {
        double V=(3.142*r*r*h)/3;
        System.out.print("Volume of Cone: ");
        return V;
    }
}
