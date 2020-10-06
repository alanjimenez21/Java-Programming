/**
Description: This program will organize Exams scores and Gender, and output them in order
              of average by gender, grades, and class average.
*/

import java.util.Scanner;

public class GradeBook {
    public static void main(String[] args) {
        //Define Scanner
        Scanner userInput = new Scanner(System.in);

        //Grade Book
        System.out.println("Welcome to GradeBook");
        System.out.println("---------------------------------");
        System.out.print("How many students are there in your class? ");
        int numberOfStudents = userInput.nextInt();

        //Define Variables Outside of For Loop
        int studentsCount = 1;
        int totalExamScores = 0, classAverage = 0;
        int gradeACount = 0, gradeBCount = 0, gradeCCount = 0, gradeDCount = 0, gradeFCount = 0;
        int maleSum = 0, femaleSum = 0, examMaleSum = 0, examFemaleSum = 0;
        int averageMaleScore = 0, averageFemaleScore = 0;

        //While loop
        while (studentsCount <= numberOfStudents) {
            //Student Score & Count Total Exam Scores Code
            System.out.println("Enter info for student " + studentsCount + ": ");
            System.out.print("Score: ");
            int examScore = userInput.nextInt();
            totalExamScores += examScore;
            classAverage = totalExamScores / numberOfStudents;

            //Student isMale or isFemale
            System.out.print("Gender (F/M): ");
            char gender = userInput.next().charAt(0);

            //Count of Genders & Average by Gender
            if (gender == 'M') {
                maleSum++;
                examMaleSum += examScore;
                averageMaleScore = examMaleSum / maleSum;
            } else if (gender == 'F') {
                femaleSum++;
                examFemaleSum += examScore;
                averageFemaleScore = examFemaleSum / femaleSum;
            }

            //Count Grade Letters
            if (examScore >= 90) {
                gradeACount++;
            } else if (examScore >= 80) {
                gradeBCount++;
            } else if (examScore >= 70) {
                gradeCCount++;
            } else if (examScore >= 60) {
                gradeDCount++;
            } else {
                gradeFCount++;
            }

            //++ Prevents an infinite while loop
            studentsCount++;
        }
        //Average Results & Grades
        System.out.println("----------------------------");
        System.out.println("The class average is: " + (double) classAverage);
        System.out.println("The average score for the " + maleSum + " male students is " + (double) averageMaleScore);
        System.out.println("The average score for the " + femaleSum + " female students is " + (double) averageFemaleScore);
        System.out.println("Number of As are: " + gradeACount);
        System.out.println("Number of Bs are: " + gradeBCount);
        System.out.println("Number of Cs are: " + gradeCCount);
        System.out.println("Number of Ds are: " + gradeDCount);
        System.out.println("Number of Fs are: " + gradeFCount);

    }
}
