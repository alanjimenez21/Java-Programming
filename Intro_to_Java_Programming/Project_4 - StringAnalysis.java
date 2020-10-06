/**
Description: This program will switch letters in a string and validate if it can be a palindrome
*/

import java.util.Scanner;

public class StringAnalysis {
    public static void main(String[] args) {
        //Define Scanner
        Scanner userInput = new Scanner(System.in);

        //Print Statements & User Input
        System.out.println("Please enter a line of text below: ");
        String stringToAnalyze = userInput.nextLine();

        //If & Else Statement
        if (stringToAnalyze.length() >= 7) {
            //Step 1: Convert it to all upper case.
            System.out.println("Analysis #1: Convert to upper cases: ");
            System.out.println(stringToAnalyze.toUpperCase());

            //Step 2: Swap the first 2 characters with the last 5 characters.
            System.out.println("Analysis #2: Swap the first 2 characters with the last 5 characters: ");

            //Variables & Process
            int lastFiveCharacters = stringToAnalyze.length() - 5; //(int: gets any length of string, and picks last five characters of teh string)
            String swapFiveCharacters = stringToAnalyze.substring(lastFiveCharacters); // Get last 5 characters
            String swapFirstTwoCharacters = stringToAnalyze.substring(0, 2); //Gets the first two characters on string
            String middleCharacters = stringToAnalyze.substring(2, lastFiveCharacters); //Gets what is left out of the string
            String swappedResult = swapFiveCharacters + middleCharacters + swapFirstTwoCharacters;

            //Result
            System.out.println(swappedResult.trim());

            //Step 3: Judge if this string is a palindrome.
            System.out.println("Analysis #3: Is it a palindrome? ");

            // Variables & Process
            char endsWith = stringToAnalyze.charAt(stringToAnalyze.length() - 1);
            String middleString = stringToAnalyze.substring(1, stringToAnalyze.length() - 1);
            char beginsWith = stringToAnalyze.charAt(0);
            String reverseString = endsWith + middleString + beginsWith;

            //Result - Ternary
            boolean isItPalindrome = (stringToAnalyze.equalsIgnoreCase(reverseString.trim()) ? true : false);
            System.out.println(isItPalindrome);

        } else
            System.out.println("The input is too short. No analysis to be performed. ");

    }
}


