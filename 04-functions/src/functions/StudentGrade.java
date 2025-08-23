package functions;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter Number of Subjects: ");
        int numOfSubjects = in.nextInt();
        Grade(numOfSubjects);
    }

    static void Grade(int numOfSubjects) {
        Scanner in = new Scanner(System.in);
        int totalMarks = 0;
        System.out.println("Enter marks for " + numOfSubjects + " subjects:");
        for (int i = 0; i < numOfSubjects; i++) {
            totalMarks += in.nextInt();
        }

        System.out.println("Total Marks: " + totalMarks);

        // Correct percentage calculation
        float percentage = ((float) totalMarks / (numOfSubjects * 100)) * 100;
        System.out.println("Percentage: " + percentage + "%");

//        // Grade assignment
//        if (percentage >= 90) {
//            System.out.println("Grade: AA");
//        } else if (percentage >= 80) {
//            System.out.println("Grade: AB");
//        } else if (percentage >= 70) {
//            System.out.println("Grade: BB");
//        } else if (percentage >= 60) {
//            System.out.println("Grade: BC");
//        } else if (percentage >= 50) {
//            System.out.println("Grade: CD");
//        } else {
//            System.out.println("Grade: DD");
//        }

        int gradeBucket = (int) percentage / 10;

        switch (gradeBucket) {
            case 10: // For 100%
            case 9:
                System.out.println("Grade: AA");
                break;
            case 8:
                System.out.println("Grade: AB");
                break;
            case 7:
                System.out.println("Grade: BB");
                break;
            case 6:
                System.out.println("Grade: BC");
                break;
            case 5:
                System.out.println("Grade: CD");
                break;
            default:
                System.out.println("Grade: DD");
        }

    }
}