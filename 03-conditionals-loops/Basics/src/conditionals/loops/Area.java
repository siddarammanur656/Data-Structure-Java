package conditionals.loops;

import java.awt.*;

public class Area {

    public static void main(String[] args) {
        System.out.println(Circle(2));
        System.out.println(Triangle(3,4));
        System.out.println(Rectangle(6,8));
        System.out.println(Isosceles_triangle(3,4));
        System.out.println(Parallelogram(4,6));
        System.out.println(Rhombus(6,6));
        System.out.println(Equilateral_Triangle(4));
        System.out.println(Curved_surface_area_of_cylinder(2,8));
        System.out.println(Total_surface_area_of_cube(4));
    }

    private static double Total_surface_area_of_cube(int a) {
        double area=6*a*a;
        System.out.print("Total surface area of a cube: ");
        return area;
    }

    static double Curved_surface_area_of_cylinder(int r, int h) {
        double area=2*3.142*r*h;
        System.out.print("Curved surface area of a cylinder: ");
        return area;
    }

    static double Equilateral_Triangle(int a) {
        double area=(Math.sqrt(3)*a*a)/4;
        System.out.print("Area of Equilateral Triangle: ");
        return area;
    }

    private static double Rhombus(int p, int q) {
        double area=(p*q)/2;
        System.out.print("Area of Rhombus: ");
        return area;
    }

    static double Parallelogram(int b, int h) {
        double area=b*h;
        System.out.print("Area of Parallelogram: ");
        return area;
    }

    static double Isosceles_triangle(int b, int h) {
        double area=(b*h)/2;
        System.out.print("Area of Isosceles Triangle: ");
        return area;
    }

    static double  Rectangle(int w,int l){
        double area= w*l;
        System.out.print("Area of Rectangle: ");
        return area;
    }

    static double Triangle(int b, int h) {
        double area=(b*h)/2;
        System.out.print("Area of Triangle: ");
        return area;
    }

    static double Circle(int r){
        double area=3.142*r*r;
        System.out.print("Area of Circle: ");
        return area;
    }

}
