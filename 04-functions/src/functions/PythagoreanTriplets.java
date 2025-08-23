package functions;

public class PythagoreanTriplets {
    public static void main(String[] args) {
        int limit = 100;

        System.out.println("Pythagorean triplets up to " + limit + ":");

        for (int a = 1; a <= limit; a++) {
            for (int b = a; b <= limit; b++) {
                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);

                if (c * c == cSquared && c <= limit) {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }
    }
}