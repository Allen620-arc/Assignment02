/*
    Name: Allen Keettikkal
    NSID: alk423
    Student Number: 11278995
 */

public class a2q1 {

    public static void main(String []args){

        // Assignment Marks:
        int Assignment1 = 100;
        int Assignment2 = 100;
        int Assignment3 = 100;
        int Assignment4 = 100;
        int Assignment5 = 100;
        int Assignment6 = 100;

        // Exercise Marks:
        int Exercise1 = 100;
        int Exercise2 = 100;
        int Exercise3 = 100;
        int Exercise4 = 100;
        int Exercise5 = 100;
        int Exercise6 = 100;

        // Midterm Mark:
        int Midterm = 100;

        // Final Exam Mark:
        int Final = 100;

        // Assignment Total Mark:
        double AssignmentTotal = .06 * Assignment1 + .06 * Assignment2 + .06 * Assignment3 + .06 * Assignment4 + .06 * Assignment5 + .06 * Assignment6;

        // Exercise Total Mark:
        double ExerciseTotal = .03 * Exercise1 + .03 * Exercise2 + .03 * Exercise3 + .03 * Exercise4 + .03 * Exercise5 + .03 * Exercise6;

        // Course Mark:
        double CourseMark = AssignmentTotal + ExerciseTotal + 0.21 * Midterm + 0.25 * Final;
        System.out.print("Your total course mark is: " + (int)CourseMark + "\n");
    }
}
