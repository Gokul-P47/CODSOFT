import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int subjects = sc.nextInt();
        int totMarks = 0;
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            totMarks += marks;
        }

        double average = (double) totMarks / subjects;

        String grade;
        if (average >= 90) {
            grade = "A";
        }
        else if (average >= 80) {
            grade = "B";
        }
        else if (average >= 70) {
            grade = "C";
        }
        else if (average >= 60) {
            grade = "D";
        }
        else {
            grade = "F";
        }
        System.out.println("Total Marks: " + totMarks);
        System.out.printf("Average Percentage: %.2f%%\n", average);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
