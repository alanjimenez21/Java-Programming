/**
Description: This program will print print a plan depending on weather and loan approval.
*/

import java.util.Scanner;

public class WeekendPlan {
    public static void main(String[] args) {
        //Introduction to the program
        System.out.println("This program will help you decide what to do this weekend.");
        System.out.println("Please answer a few questions below.");

        //Defining Scanner
        Scanner userInput = new Scanner(System.in);

        //Print Statements & User Input
        System.out.print("* Are you expecting a visitor this weekend(Enter 1 for YES and 0 for NO)? ");
        int visitorAnswer = userInput.nextInt();
        System.out.print("* What's the weather going to be this weekend(Enter 1 for SUNNY, 2 for OVERCAST, 3 for RAIN, and 4 for SNOW? ");
        int weatherAnswer = userInput.nextInt();
        System.out.print("* Have you got a mortgage loan approved(Enter 1 for YES and 0 for NO)? ");
        int loanAnswer = userInput.nextInt();

        //Store Answers as Booleans
        boolean isVisitorComing = (visitorAnswer == 1);
        boolean isWeatherSunnyOrOvercast = (weatherAnswer == 1 || weatherAnswer == 2);
        boolean isWeatherSnowOrRain = (weatherAnswer == 3 || weatherAnswer == 4);
        boolean isLoanApproved = (loanAnswer == 1);

        //Plan options for the weekend
        String planOne = " stay home.";
        String planTwo = " go fishing.";
        String planThree = " meet with a realtor.";

        //If & Else Statements Including Boolean Expressions
        if (isVisitorComing) {
            System.out.println("Your weekend plan is to" + planOne);
        } else if (isWeatherSunnyOrOvercast && !isLoanApproved) {  //use ! to show Loan is not approved
            System.out.println("Your weekend plan is to" + planTwo);
        } else if (isWeatherSunnyOrOvercast && isLoanApproved) {
            System.out.println("Your weekend plan is to" + planThree);
        } else if (isWeatherSnowOrRain && !isLoanApproved) {    //use ! to show Loan is not approved
            System.out.println("Your weekend plan is to" + planOne);
        } else if (isWeatherSnowOrRain && isLoanApproved) {
            System.out.println("Your weekend plan is to" + planThree);
        }

    }
}
