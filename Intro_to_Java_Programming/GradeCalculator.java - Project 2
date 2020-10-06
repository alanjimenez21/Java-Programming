/**
Description: This program will calculate an average grade
*/

import java.util.Scanner; //Import Scanner from java.util library for text scanning

public class GradeCalculator {
    public static void main(String[] args) {
        //Defining Scanner
        Scanner userInput = new Scanner(System.in);

        //Define Constant Variables
        final double QUIZZES = (20.0 / 100.0); //REVEL Quizzes is 20%
        final double LAB_ASSIGNMENTS = (30.0 / 100.0); //Programming Lab Assignments is 30%
        final double COURSE_PROJECT = (10.0 / 100.0); // Comprehensive project is 10%
        final double MIDTERM_EXAM = (20.0 / 100.0); // Midterm Exam is 20%
        final double FINAL_EXAM = (20.0 / 100.0); // Final Exam is 20%

        //Print Statements & User Input
        System.out.print("Enter quiz average: ");
        int averageQuizScore = userInput.nextInt();
        System.out.print("Enter lab average: ");
        int averageLabScore = userInput.nextInt();
        System.out.print("Enter comprehensive project: ");
        int courseProjectScore = userInput.nextInt();
        System.out.print("Enter midterm: ");
        int midtermScore = userInput.nextInt();
        System.out.print("Enter final: ");
        int finalScore = userInput.nextInt();

        //Calculate Course Numerical Grade
        System.out.println("-----------------------------");
        double courseNumericalGrade = ((averageQuizScore * QUIZZES) + (averageLabScore * LAB_ASSIGNMENTS) + (courseProjectScore * COURSE_PROJECT) + (midtermScore * MIDTERM_EXAM) + (finalScore * FINAL_EXAM));
        System.out.print("Your final numerical grade is: " + courseNumericalGrade);


    }
}
