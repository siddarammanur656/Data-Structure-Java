
package Arrays;
import java.util.*;

public class Arrayinput {
    public static void array() {
        int[] marks = new int[100];  // Correct array declaration
        Scanner sc = new Scanner(System.in);

        // Input marks
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        marks[3] = sc.nextInt();

        // Output marks
        System.out.println("Physics: " + marks[0]);
        System.out.println("Chemistry: " + marks[1]);
        System.out.println("Math: " + marks[2]);
        System.out.println("Biology: " + marks[3]);
        System.out.println(marks.length);
        
        sc.close(); // Closing the scanner to avoid resource leak
    }
    public static void main(String[] args) {
        array();
    }
}
