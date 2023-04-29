package programs;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks of the student in four subjects: ");
        int subject1 = scanner.nextInt();
        int subject2 = scanner.nextInt();
        int subject3 = scanner.nextInt();
        int subject4 = scanner.nextInt();

        int totalMarks = subject1 + subject2 + subject3 + subject4;
        double aggregate = totalMarks / 4.0;

        String grade;
        if (aggregate >= 75) {
            grade = "Distinction";
        } else if (aggregate >= 60 && aggregate < 75) {
            grade = "First Division";
        } else if (aggregate >= 50 && aggregate < 60) {
            grade = "Second Division";
        } else if (aggregate >= 40 && aggregate < 50) {
            grade = "Third Division";
        } else {
            grade = "Fail";
        }

        System.out.println("Total marks: " + totalMarks);
        System.out.println("Aggregate: " + aggregate);
        System.out.println("Grade: " + grade);
    }
}
